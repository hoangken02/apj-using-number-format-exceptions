package com.kenIT;

public class ExampleCalculator {
    public void calculator(double x, double y){
        try{
            double addition = x + y;
            double subtraction = x - y;
            double multiplication = x * y;
            double division = x / y;
            System.out.println("Addition = " + addition);
            System.out.println("Subtraction = " + subtraction);
            System.out.println("Multiplication = " + multiplication);
            System.out.println("Division = " + division);
        }catch (NumberFormatException numberFormatException){
            numberFormatException.getMessage();
        }
    }
}
