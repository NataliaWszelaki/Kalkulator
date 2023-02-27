package com.example.kalkulator;

import org.springframework.boot.SpringApplication;

public class Calculator {
    public int subtractBFromA(int a, int b) {
        return b - a;
    }

    public int addCToD(int c, int d) {
        return c + d;
    }
    public void someMethod() {
        System.out.println("\n" + "It works!");
    }
}
