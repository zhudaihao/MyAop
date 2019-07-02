package cn.wqgallery.myaop.aspect;

import android.os.SystemClock;
import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


//定义切面
@Aspect
public class LoginAspect {
    //定义切面规则
    //1 定义切入点  定义个方法接受所有使用注解的
    //execution（注解名 注解使用的地方）   * *(..)：表示不限制类 方法及方法参数
    @Pointcut("execution(@cn.wqgallery.myaop.annotation.Login * *(..))")
    public void methodAnnotationWithBehaviorTrace() {
        //每个使用了BehaviorTrace 注解的地方都会调用这个方法

    }

    //对切面内容如何处理
//    @After("methodAnnotationWithBehaviorTrace()") //在切入点后运行
// @Before("methodAnnotationWithBehaviorTrace()") //在切入点前运行
    //在切入点前后都运行  Around（为切入点方法）
    @Around("methodAnnotationWithBehaviorTrace()")
    public Object weavoJoinPoint(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object proceed = proceedingJoinPoint.proceed();
        long a = System.currentTimeMillis();
        SystemClock.sleep(500);
        Log.e("aop", "------" + (System.currentTimeMillis() - a));

        return proceed;
    }


}
