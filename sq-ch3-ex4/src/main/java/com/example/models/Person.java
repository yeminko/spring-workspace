package com.example.models;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";

    private final Parrot parrot;

    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
