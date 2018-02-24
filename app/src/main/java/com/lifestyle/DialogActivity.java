package com.lifestyle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("xxx", "DialogonCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    @Override
    protected void onStart() {
        Log.e("xxx", "DialogonStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("xxx", "DialogonResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.e("xxx", "DialogonRestart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.e("xxx", "DialogonPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("xxx", "DialogonStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("xxx", "DialogonDestroy");
        super.onDestroy();
    }
}
