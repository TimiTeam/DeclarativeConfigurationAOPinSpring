package com.apress.prospring4.ch5.classes;


public class MyDependency {
    public void foo(int intValue){
        System.out.println("foo(int): "+intValue);
    }
    public void bar(){
        System.out.println("bar()");
    }
}
