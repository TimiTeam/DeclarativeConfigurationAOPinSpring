package com.apress.prospring4.ch5.classes;


public class MyBean {
    private MyDependency dependency;


    public void setDependency(MyDependency dependency) {
        this.dependency = dependency;
    }

    public void execute() {
        dependency.foo(100);
        dependency.foo(101);
        dependency.bar();
    }
}
