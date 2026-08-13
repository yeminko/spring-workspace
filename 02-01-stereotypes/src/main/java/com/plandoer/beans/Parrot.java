package com.plandoer.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    @PostConstruct
    public void init() {
        name = "Polly";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}