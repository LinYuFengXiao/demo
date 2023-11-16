package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Date;

//定义切面类：功能增强
//加入注解，说明是一个切面
@Aspect
public class MyAspect {
    //引入Before前置通知
    //属性：value切入点表达式[切入到目标类的那个方法上去]，表达切面的执行位置
    //execution(参数类型  执行的包名称.类名称.类的方法（里面的参数可以任意）)
    //位置：在方法的定义之前
    //
    @Before(value = "myPointcut()")
    public void myBefore(JoinPoint jp){

        System.out.println("连接点方法的定义："+ jp.getSignature());
        System.out.println("连接点方法的参数个数："+ jp.getArgs().length);
        Object[] args= jp.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        System.out.println("开始日志"+new Date());
    }


    //后置通知，返回还要加入
    @AfterReturning(value = "execution(* com.example.service.SomeService.doOther(..))",returning = "result")
    public void myAfterReturning(Object result){
        //修改目标方法的执行结果
        if (result !=null){
            //强制转换为String
            String s = (String) result;
            //转换为大写
            result = s.toUpperCase();
        }
        System.out.println("返回值" +result);
    }

    //环绕通知——>环绕通知=前置+目标方法执行+后置通知
    @Around(value = "execution(* com.example.service.SomeService.doFirst(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        //增强功能
        System.out.println("环绕通知:在目标方法之前执行，例如：输出日志");
        //proceed方法就是用于启动目标方法执行
        Object obj = pjp.proceed();//调用目标方法
        //增强的功能
        System.out.println("环绕通知:在目标方法之后执行，例如：处理事务");
        return obj;
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.example.service.SomeService.doSecond(..))",throwing = "ex")
    public void myAfterThrowing(Throwable ex){
        //把异常发生的时间,位置,原因记录到数据库,日志文件等等,
        //可以在异常发生时,把异常信息通过短信,邮件发送给开发人员。
        System.out.println("异常通知:在目标方法抛出异常的时候执行，异常原因：" + ex.getMessage());
    }

    //最终通知
    @After(value = "execution(* com.example.service.SomeService.doThird(..))")
    public void myAfter(){
        System.out.println("最终通知:总是会被执行的方法");
    }

    //相当于给切入点表达式，起一个别名
    @Pointcut(value = "execution(* com.example.service.SomeService..*(..))")
    public void myPointcut() {
    }

}