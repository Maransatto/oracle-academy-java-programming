package br.com.javaproramming;

import java.util.Scanner;

public class ValueChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número: ");
        Integer number = in.nextInt();

        if (number == 7) {
            System.out.println("Sortudo!");
        } else if (number == 13) {
            System.out.println("Azarado!");
        } else {
            System.out.println("Tanto faz!");
        }

        in.close();
    }
}
