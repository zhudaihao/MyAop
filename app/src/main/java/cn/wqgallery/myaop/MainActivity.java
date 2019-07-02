package cn.wqgallery.myaop;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import cn.wqgallery.myaop.annotation.Login;

public class MainActivity extends AppCompatActivity {

    private String zdh = "oop";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //oop 统计
    public void click1(View view) {
        long a = System.currentTimeMillis();
        SystemClock.sleep(500);
        Log.e(zdh, "------" + (System.currentTimeMillis() - a));

    }

    //使用注解 aop统计
    @Login
    public void click2(View view) {

    }

}
