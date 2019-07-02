package cn.wqgallery.mylogin.aspect;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import cn.wqgallery.mylogin.MyApp;

/**
 * 注意类需要注解
 */
@Aspect
public class LoginAspect {

    //切面入口
    @Pointcut("execution(@cn.wqgallery.mylogin.annotation.Login * *(..))")
    public void loginMain() {
    }


    //处理切面内容
    @Around("loginMain()")
    public Object setLogin(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Context context = MyApp.getinstacne().getApplicationContext();
        Intent intent = new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setComponent(new ComponentName("cn.wqgallery.mylogin", "cn.wqgallery.mylogin.LoginActivity"));
        context.startActivity(intent);

        return proceedingJoinPoint.proceed();
    }
}
