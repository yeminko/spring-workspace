package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.configs.ProjectConfig;
import com.example.models.Person;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var person = context.getBean(Person.class);
        System.out.println("Person's Name: " + person.getName());
        System.out.println("Person's parrot's Name: " + person.getParrot().getName());
    }
}
