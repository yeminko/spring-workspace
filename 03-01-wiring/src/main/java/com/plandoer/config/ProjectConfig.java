package com.plandoer.config;

import com.plandoer.beans.Parrot;
import com.plandoer.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("John");
        return person;
    }

    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Polly");
        return parrot;
    }
}