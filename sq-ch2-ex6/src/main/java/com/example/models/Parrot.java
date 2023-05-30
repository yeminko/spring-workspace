package com.example.models;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    @PostConstruct
    public void init() {
        name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
