package br.com.javaproramming;

public class StringOperators {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Maransatto";
        String str3 = "You are " + str2;

        System.out.println("Welcome: " + str2);
        System.out.println("Length: " + str1.length());
        System.out.println("Sub: " + str3.substring(0,5));
        System.out.println("Upper: " + str2.toUpperCase());
    }
}
