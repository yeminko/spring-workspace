package com.plandoer;

import com.plandoer.beans.Parrot;
import com.plandoer.beans.Person;
import com.plandoer.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        System.out.println(person.getName());
        System.out.println(person.getParrot());

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());
    }
}