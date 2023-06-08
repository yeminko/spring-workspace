package com.example.models;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Koko";

    private final Person person;

    Parrot(Person person) {
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
