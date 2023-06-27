package com.khadri.spring.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Customer cust = context.getBean("cust", Customer.class);
        System.out.println(cust.getName());

        Customer cust1 = context.getBean("cust1", Customer.class);
        System.out.println(cust1.getName());
    }
}