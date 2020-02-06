package com.example.mytasks;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private static String value;
    public static String getValue() {
        return value;
    }
    private static String valu;
    public static String getValue1() {
        return valu;
    }
    private static String val;
    public static String getValue2() {
        return val;
    }
    private static String va;
    public static String getValue3() {
        return va;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = findViewById( R.id.edit1 );
        final EditText editText1 = findViewById( R.id.edit2 );
        final EditText editText2 = findViewById( R.id.edit3 );
        final EditText editText3 = findViewById( R.id.edit4 );
        Button button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value = editText.getText().toString().trim();
                valu = editText1.getText().toString().trim();
                val = editText2.getText().toString().trim();
                va = editText3.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}