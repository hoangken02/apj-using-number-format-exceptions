package com.kenIT;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter number y: ");
        double y = scanner.nextDouble();

        ExampleCalculator exampleCalculator = new ExampleCalculator();
        exampleCalculator.calculator(x,y);
    }
}


