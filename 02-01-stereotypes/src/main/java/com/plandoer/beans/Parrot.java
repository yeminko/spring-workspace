package com.plandoer.beans;

//@Component
public class Parrot {
    private String name;

//    @PostConstruct
//    public void init() {
//        name = "Polly";
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}