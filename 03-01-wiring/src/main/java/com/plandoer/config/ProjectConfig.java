package com.plandoer.config;

import com.plandoer.beans.Parrot;
import com.plandoer.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.plandoer.beans")
public class ProjectConfig {

//    @Bean
//    public Person person(Parrot parrot) {
//        Person person = new Person();
//        person.setName("John");
//        person.setParrot(parrot);
//        return person;
//    }
//
//    @Bean
//    public Parrot parrot() {
//        Parrot parrot = new Parrot();
//        parrot.setName("Polly");
//        return parrot;
//    }
}