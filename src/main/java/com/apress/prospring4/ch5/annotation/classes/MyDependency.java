package com.apress.prospring4.ch5.annotation.classes;

import org.springframework.stereotype.Component;

@Component("myDependency")
public class MyDependency {
    public void foo(int intValue){
        System.out.println("foo(): "+intValue);
    }
    public void bar(){
        System.out.println("bar()");
    }
}
