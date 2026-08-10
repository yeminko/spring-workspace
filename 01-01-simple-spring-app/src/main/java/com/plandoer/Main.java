package com.plandoer;

import com.plandoer.beans.Parrot;
import com.plandoer.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot p = context.getBean("parrot2", Parrot.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}