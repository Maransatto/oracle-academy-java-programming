package br.com.javaproramming;

import java.util.Scanner;

public class InputVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean boolVal;
        byte byteVal;
        char CharVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;

        System.out.println("Please enter a boolean value: ");
        boolVal = in.nextBoolean();
        System.out.println("Boolean Value: " + boolVal);
        System.out.println();

        System.out.println("Please enter a byte value: ");
        byteVal = in.nextByte();

        // ok ok ok...
    }
}
