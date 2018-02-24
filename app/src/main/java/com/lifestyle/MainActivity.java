package com.lifestyle;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;


public class MainActivity extends AppCompatActivity {

    private LinearLayout activityMain;
    private Button dialog;
    private Button pop;
    private Button tosecond;
    private Button dialogActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("xxx", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @Override
    protected void onStart() {
        Log.e("xxx", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("xxx", "onResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.e("xxx", "onRestart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.e("xxx", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("xxx", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("xxx", "onDestroy");
        super.onDestroy();
    }

    private void initView() {
        activityMain = (LinearLayout) findViewById(R.id.activity_main);
        dialog = (Button) findViewById(R.id.dialog);
        pop = (Button) findViewById(R.id.pop);
        tosecond = (Button) findViewById(R.id.tosecond);
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this).setTitle("标题").setMessage("弹出dialog").setNegativeButton("取消", null).show();
            }
        });
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPop();
            }
        });

        tosecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        dialogActivity = (Button) findViewById(R.id.dialog_activity);
        dialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });

    }

    public void showPop() {
        View view = LayoutInflater.from(this).inflate(R.layout.view_pop, null);
        PopupWindow popupWindow = new PopupWindow(view, 1000, 2000, true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.RED));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.showAsDropDown(pop);

    }

    /**
     * 1：启动activity
     * onCreate---onStart---onResume
     * 2：销毁
     * onPause-onStop-onDestroy
     * 3：返回后台（home）
     * onPause-onStop
     * 4：返回前台
     * onRestart-onStart-onResume
     * 5：启动第二个activity
     *  onPause -2onCreate-2onStart-2onResume-onStop
     * 6：返回第一个activity
     *  2onPause-onRestart-onStart-onResume-2onStop-2onDestroy
     * 7:打开dialogActivity
     * onpause-DialogonCreate-DialogonStart-DialogonResume
     * 8:关闭dialogactivity
     *DialogonPause-onResume-DialogonStop-DialogonDestroy
     * 9：打开dialogactivity时返回后台
     *DialogonPause-onStop-DialogonStop
     * 10：打开dialogactivity时切回前台
     * onRestart-onStart-DialogonRestart-DialogonStart-DialogonResume
     * */
}
