package com.example.service.Impl;

import com.example.service.SomeService;

import java.util.Date;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name,int age) {

        //不加入aop时如果要在开始之前加入---需要每次都要修改硬编码
        //System.out.println("-------开始日志"+ new Date()+"-----");
        System.out.println("======doSome方法=======");

    }

    @Override
    public String doOther(String name,int age) {
        System.out.println("======doOther方法=======");
        return "abcd";
    }

    @Override
    public String doFirst(String name, int age) {
        System.out.println("======doFirst方法======="+ name + ":" + age);
        return "doFirst";
    }

    @Override
    public void doSecond() {
        System.out.println("======doSecond方法========" + (10/0));
    }

    @Override
    public void doThird() {
        System.out.println("=======doThird方法=======" + (10/2));
    }
}