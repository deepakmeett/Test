package com.example.test;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
public class Main3Activity extends AppCompatActivity {

    EditText textView, textView1;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main3 );
        textView = findViewById( R.id.text5 );
        textView1 = findViewById( R.id.text6 );
        
        sharedPreferences = getSharedPreferences( "data", MODE_PRIVATE );

        if (sharedPreferences.contains( "a" ) && sharedPreferences.contains( "b" )) {
            textView.setText( sharedPreferences.getString( "a", "" ) );
            textView1.setText( String.valueOf( sharedPreferences.getInt( "b", 0 ) ) );
        }
    }
}
