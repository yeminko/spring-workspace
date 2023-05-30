package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.configs.ProjectConfig;
import com.example.models.Parrot;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p);
        System.out.println(p.getName());

    }
}
