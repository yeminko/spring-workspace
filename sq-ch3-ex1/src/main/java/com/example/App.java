package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.configs.ProjectConfig;
import com.example.models.Parrot;
import com.example.models.Person;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println("Person's name: " + person.getName());

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot());

    }
}
