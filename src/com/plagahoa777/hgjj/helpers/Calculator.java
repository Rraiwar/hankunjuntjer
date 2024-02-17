package com.plagahoa777.hgjj.helpers;

public class Calculator {
    public static String getDivisibleOutput(int numerrator) {
        String output = "Denominator : ";
        for (int i = 2; i < numerrator; i++) {
            if (numerrator % i == 0) {
                output += i + ",";
            }
        }
        return output;
    }
}
