package com.example.dothuyquynh_59132066_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate Called");



    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("LifeCycle","onStart Called");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("LifeCycle","onRestart Called");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("LifeCycle","onResume Called");
        Toast.makeText(getApplicationContext(),"DoThuyQuynh_59132066_LifeCycle",Toast.LENGTH_SHORT).show();
        TextView texTime = (TextView) findViewById(R.id.time);
        DateFormat dateFormatter=new SimpleDateFormat("HH:mm:ss");
        Date today=new Date();
        String s= dateFormatter.format(today);
        texTime.setText(s);
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("LifeCycle","onPause Called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("LifeCycle","onStop Called");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("LifeCycle","onDestroy Called");
    }
}
