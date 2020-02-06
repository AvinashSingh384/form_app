package com.example.mytasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static String value4;
    public static String getValue4() {
        return value4;
    }

    private static String value5;
    public static String getValue5() {
        return value5;
    }

    private static String value6;
    public static String getValue6() {
        return value6;
    }

    private static String value7;
    public static String getValue7() {
        return value7;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        final EditText editText5 = findViewById( R.id.edit5 );
        final EditText editText6 = findViewById( R.id.edit5 );
        final Spinner spinner = findViewById( R.id.spinner );
        final EditText editText7 = findViewById( R.id.edit7 );
        Button btn = findViewById( R.id.btn2 );

        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value7 = spinner.getSelectedItem().toString();
                value4 = editText5.getText().toString().trim();
                value5 = editText6.getText().toString().trim();
                value6 = editText7.getText().toString().trim();
                Intent intent = new Intent( SecondActivity.this, ThirdActivity.class );
                startActivity( intent );
            }
        } );
    }
}