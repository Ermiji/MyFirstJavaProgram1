package com.company;

import java.util.Scanner;

public class InputOutput {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        double num1, num2, total, average;

        System.out.print("Enter first number: ");
        num1 = scan.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scan.nextDouble();

        total = num1 + num2;

        average = total/2;

        System.out.println("Average of two double values is: " + average);

    }
}
