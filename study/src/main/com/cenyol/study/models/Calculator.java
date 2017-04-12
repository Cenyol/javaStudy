package com.cenyol.study.models;


/**
 * Created by cenyol on 02/03/2017.
 */
public class Calculator {
    private byte[] strings = new byte[1 * 1024 * 1024];
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+"))
            sum += Integer.valueOf(summand);
        return sum;
    }
}