package com.lifestyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("xxx", "2onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onStart() {
        Log.e("xxx", "2onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("xxx", "2onResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.e("xxx", "2onRestart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.e("xxx", "2onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("xxx", "2onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("xxx", "2onDestroy");
        super.onDestroy();
    }
}
