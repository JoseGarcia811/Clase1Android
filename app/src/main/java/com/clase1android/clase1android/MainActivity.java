package com.clase1android.clase1android;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

     Button button1;
     Button button2;
     Button button3;
     Button button4;
     Button button5;
     Button button6;
     Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 =  (Button)findViewById(R.id.button);
        button2 =  (Button)findViewById(R.id.button2);
        button3 =  (Button)findViewById(R.id.button3);
        button4 =  (Button)findViewById(R.id.button4);
        button5 =  (Button)findViewById(R.id.button5);
        button6 =  (Button)findViewById(R.id.button6);
        button7 =  (Button)findViewById(R.id.button7);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {


        switch (view.getId()){
            case R.id.button :

                getView (View1Activity.class);
                break;
            case R.id.button2 :
                getView (View2Activity.class);
                break;
            case R.id.button3 :
                getView (View3Activity.class);
                break;
            case R.id.button4 :
                getView (TableLayoutActivity.class);
                break;
            case R.id.button5 :
                getView (View5Activity.class);
                break;
            case R.id.button6 :
                getView (View6Activity.class);
                break;
            case R.id.button7 :
                getView (View6Activity.class);
                break;
        }
    }

    private void getView (Object context)
    {
        Intent i;
        i = new Intent(MainActivity.this, (Class<?>) context);
        startActivity(i);
    }
}
