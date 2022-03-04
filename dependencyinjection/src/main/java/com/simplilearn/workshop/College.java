package com.simplilearn.workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class College {

    private String collegeName;

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

    @Value("${college.Name}")
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void test() {
        principal.principalInfo();
        teacher.teach();
        System.out.println("My collegeName = " + collegeName);
        System.out.println("testing this method");
    }
}
