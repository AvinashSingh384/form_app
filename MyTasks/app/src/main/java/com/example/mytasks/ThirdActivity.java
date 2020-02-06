package com.example.mytasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_third );
        TextView textView = findViewById(R.id.text3);
        TextView textView1 = findViewById( R.id.text4 );
        TextView textView2 = findViewById( R.id.text5 );
        TextView textView3 = findViewById( R.id.text6 );
        TextView textView4 = findViewById( R.id.text7 );
        TextView textView5 = findViewById( R.id.text8 );
        TextView textView6 = findViewById( R.id.text9 );
        TextView textView7 = findViewById( R.id.sp );

        textView.setText(MainActivity.getValue());
        textView1.setText( MainActivity.getValue1());
        textView2.setText( MainActivity.getValue2() );
        textView3.setText( MainActivity.getValue3() );
        textView4.setText( SecondActivity.getValue4() );
        textView5.setText( SecondActivity.getValue5() );
        textView6.setText( SecondActivity.getValue6() );
        textView7.setText( SecondActivity.getValue7() );
    }
}
