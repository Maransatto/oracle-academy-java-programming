package br.com.javaproramming;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer age;

        System.out.println("Please tell me your age: ");
        age = in.nextInt();

        if (age >= 21) {
            System.out.println("You're an adult");
        } else {
            System.out.println("You're a kid");
        }
        
        in.close();
    }
}
