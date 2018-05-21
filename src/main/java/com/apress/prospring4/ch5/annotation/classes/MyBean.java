package com.apress.prospring4.ch5.annotation.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myBean")
public class MyBean {
    private MyDependency dependency;

    @Autowired
    public void setDependency(MyDependency dependency) {
        this.dependency = dependency;
    }

    public void excute(){
        dependency.foo(100);
        dependency.foo(101);
        dependency.bar();
    }
}
