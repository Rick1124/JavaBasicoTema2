package com.tema2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        double finalPrice = addIVA(n);
        System.out.println(finalPrice);
    }
    static double addIVA(double value) {
        double iva = value * 0.15;
        value += iva;
        return value;
    }
}
