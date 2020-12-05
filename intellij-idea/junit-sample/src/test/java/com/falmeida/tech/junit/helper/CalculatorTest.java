package com.falmeida.tech.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Test
    public void testConstrutor_PositiveNumbers(){
        calculator = new Calculator(1,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NegativeNumber(){
        calculator = new Calculator(-1,2);
    }

}