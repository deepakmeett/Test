package com.example.test;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.test.Whole_data.Whole;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class Main2Activity extends AppCompatActivity {

    EditText editText, editText1;
    Button button;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        editText = findViewById( R.id.textEmail );
        editText1 = findViewById( R.id.textPass );
        button = findViewById( R.id.button );
        sharedPreferences = getSharedPreferences( "data", MODE_PRIVATE );
        button.setOnClickListener( view -> {
            String email = editText.getText().toString();
            String password = editText1.getText().toString();
            AuthDetail authDetail = new AuthDetail();
            authDetail.setEmail( email );
            authDetail.setPassword( password );
            authDetail.setDeviceType( 2 );
            sendNetworkRequest( authDetail );
        } );
    }

    private void sendNetworkRequest(AuthDetail authDetail) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( Api.Base_url )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();
        Api api = retrofit.create( Api.class );
        Call<Whole> authDetailCall = api.getData( authDetail );
        authDetailCall.enqueue( new Callback<Whole>() {
            @Override
            public void onResponse(Call<Whole> call, Response<Whole> response) {
                Intent intent = new Intent( Main2Activity.this, MainActivity.class );
                String token = response.body().getData().getToken();
                int id = response.body().getData().getUser().getCompanyRoleUsers().get( 0 ).getCompany().getId();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString( "a", token );
                editor.putInt( "b", id );
                editor.apply();
                startActivity( intent );
            }

            @Override
            public void onFailure(Call<Whole> call, Throwable t) {
                Toast.makeText( Main2Activity.this, t.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }
}