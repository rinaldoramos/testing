package com.simplilearn.workshop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.simplilearn.workshop")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

/*
    @Bean
    protected Principal principalBean() {
        return new Principal();
    }

    @Bean
    public Teacher mathTeacherBean() {
        return new MathTeacher();
    }

    @Bean
    public College collegeBean() { // the name of the method is the bean id unless you specify another one
        College college = new College();
        college.setPrincipal(principalBean());
        college.setTeacher(mathTeacherBean());
        return college;
    }
    */
}
