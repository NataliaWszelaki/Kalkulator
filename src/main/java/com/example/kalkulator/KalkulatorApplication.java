package com.example.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Random;

@SpringBootApplication
public class KalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalkulatorApplication.class, args);
        Calculator calculator = new Calculator();


        Random rand = new Random();
        int a = rand.nextInt(10);
        System.out.println("a = " + a);
        int b = rand.nextInt(10);
        System.out.println("b = " + b);
        int resultS = calculator.subtractBFromA(a,b);
        System.out.println("Subtract b from a = " + resultS);

        System.out.println();

        int c = rand.nextInt(10);
        System.out.println("c = " + c);
        int d = rand.nextInt(10);
        System.out.println("d = " + d);
        int resultA = calculator.addCToD(c,d);
        System.out.println("Add c to d = " + resultA);

        calculator.someMethod();
    }

}
