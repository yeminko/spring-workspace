package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        Parrot parrot = new Parrot();
    }
}
