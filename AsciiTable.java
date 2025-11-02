package com.mycompany.asciitable;

public class AsciiTable {
    public static void main(String[] args) {
        System.out.println("ASCII Characters with their values:");
        System.out.println("----------------------------------");

        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " --> " + (char) i);
        }
    }
}
