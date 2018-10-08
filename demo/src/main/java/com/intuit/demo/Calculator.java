package com.intuit.demo;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(int x, int y){
        return x+y;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int square(int x){
        return x*x;
    }

    public int product(int x, int y){
        return x*y;
    }
}
