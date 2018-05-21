package com.apress.prospring4.ch5;


import com.apress.prospring4.ch5.annotation.classes.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectJAnnotationExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config-annotation.xml");

        MyBean myBean = context.getBean("myBean",MyBean.class);
        myBean.excute();

    }
}
