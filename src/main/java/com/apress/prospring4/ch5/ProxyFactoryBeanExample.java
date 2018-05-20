package com.apress.prospring4.ch5;


import com.apress.prospring4.ch5.classes.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context-xml.xml");

        MyBean bean = context.getBean("myBean",MyBean.class);
        bean.execute();

    }
}
