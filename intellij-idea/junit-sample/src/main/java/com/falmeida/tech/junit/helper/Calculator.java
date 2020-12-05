package com.falmeida.tech.junit.helper;

public class Calculator {

    private int A;
    private int B;

    Calculator(int A, int B){
        if(A < 0 || B <0){
            throw new IllegalArgumentException();
        }
    }

}
