package com.example.test;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.Data_list.Test;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SharedPreferences sharedPreferences;
    String token;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        recyclerView = findViewById( R.id.r1 );
        recyclerView.setHasFixedSize( true );
        recyclerView.setLayoutManager( new LinearLayoutManager( this ) );
        
        sharedPreferences = getSharedPreferences( "data", MODE_PRIVATE );
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( Api.Base_url )
                .addConverterFactory( GsonConverterFactory.create() )
                .build();
        Api api = retrofit.create( Api.class );
        
        if (sharedPreferences.contains( "a" ) && sharedPreferences.contains( "b" )) {
            token = sharedPreferences.getString( "a", "" );
            id = sharedPreferences.getInt( "b", 0 );
        }
        Call<Test> listCall = api.getTestOne( token, id, "CONNECTED" );
        
        listCall.enqueue( new Callback<Test>() {
            @Override
            public void onResponse(Call<Test> call, Response<Test> response) {
                Test list = response.body();
                recyclerView.setAdapter( new AdapterMain( MainActivity.this, list.getData()  ) );
                Toast.makeText( MainActivity.this, "Success", Toast.LENGTH_SHORT ).show();
            }

            @Override
            public void onFailure(Call<Test> call, Throwable t) {
                Toast.makeText( MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT ).show();
            }
        } );
    }
}
