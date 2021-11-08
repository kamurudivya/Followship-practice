package org.example;

import java.util.Scanner;
import java.lang.Math;
public class DeltaFunction {
    public static void main(String[] args) {
        double secondRoot = 0, firstRoot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of a ::");
        double a = sc.nextDouble();

        System.out.println("Value of b ::");
        double b = sc.nextDouble();

        System.out.println("Value of c ::");
        double c = sc.nextDouble();

        double Delta = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(Delta);

        if (Delta > 0) {
            firstRoot = (-b + Math.sqrt(Delta) / (2 * a));
            secondRoot = (-b - Math.sqrt(Delta) / (2 * a));
            System.out.println("Root are :: " + firstRoot + " and " + secondRoot);
        } else if (Delta == 0) {
            System.out.println("Root is :: " + (-b + sqrt) / (2 * a));

        }
    }
}