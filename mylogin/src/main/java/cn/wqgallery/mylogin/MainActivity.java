package cn.wqgallery.mylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.wqgallery.mylogin.annotation.Login;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 首页 不需要登录其他都需要
     */

    //购物
    @Login
    public void click1(View view) {

    }

    //付款
    @Login
    public void click2(View view) {

    }

    //个人信息
    @Login
    public void click3(View view) {

    }

    //首页
    public void click4(View view) {
        startActivity(new Intent(this,HomeActivity.class));
    }


}
