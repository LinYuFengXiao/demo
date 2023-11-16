package com.example.aoptest;

import com.example.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectTest {

    @Test
    public void test01(){
        //从容器里面获取对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //创建接口对象
        SomeService someService = (SomeService) context.getBean("someService");
        //接口调用方法
        //someService.doSome();
        //someService.doOther();
    }

    @Test
    public void test02(){
        //从容器里面获取对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //创建接口对象
        SomeService someService = (SomeService) context.getBean("someService");
        //打印一下获取的类
        System.out.println(someService.getClass());
        //接口调用方法,此时需要传递参数
        someService.doSome("张三",18);
    }

    @Test
    public void test03(){
        //从容器里面获取对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //创建接口对象
        SomeService someService = (SomeService) context.getBean("someService");
        //打印一下获取的类
        System.out.println(someService.getClass());
        //接口调用方法,此时需要传递参数
        someService.doOther("李四",20);
    }

    @Test
    public void test04(){
        //1.获取到Spring的容器
        //使用技巧：连续按住shift两次就可以看到类，ctrl+h可以查看ApplicationContext接口
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器当中取出对象
        //创建接口对象
        SomeService someService = (SomeService) ctx.getBean("someService");
        //接口调用方法,此时需要传递参数
        someService.doFirst("王五",22);
    }

    @Test
    public void test05(){
        //1.获取到Spring的容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器当中取出对象
        //创建接口对象
        SomeService someService = (SomeService) ctx.getBean("someService");
        //接口调用方法,此时需要传递参数
        someService.doSecond();
    }

    @Test
    public void test06(){
        //1.获取到Spring的容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容器当中取出对象
        //创建接口对象
        SomeService someService = (SomeService) ctx.getBean("someService");
        //接口调用方法,此时需要传递参数
        someService.doThird();
    }

}