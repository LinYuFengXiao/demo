package com.example.service;

public interface SomeService {

    //实现业务方法
    void doSome(String name,int age);

    //此处就会有返回值类型
    String doOther(String name,int age);

    String doFirst(String name,int age);

    void doSecond();

    void doThird();
}