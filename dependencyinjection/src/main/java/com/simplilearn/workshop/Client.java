package com.simplilearn.workshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        College college = context.getBean("college", College.class);
        System.out.println("college = " + college);
        college.test();
        context.close();
    }
}
