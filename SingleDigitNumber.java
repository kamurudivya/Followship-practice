package org.example;

import java.util.Scanner;

public class SingleDigitNumber {
    public static void main(String[] args) {
        System.out.println("Enter any No. between 1-9: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0 && num < 10) {
            if (num == 1)
                System.out.println("ONE");
            else if (num == 2)
                System.out.println("TWO");
            else if (num == 3)
                System.out.println("THREE");
            else if (num == 4)
                System.out.println("FOUR");
            else if (num == 5)
                System.out.println("FIVE");
            else if (num == 6)
                System.out.println("SIX");
            else if (num == 7)
                System.out.println("SEVEN");
            else if (num == 8)
                System.out.println("EIGHT");
            else if (num == 9)
                System.out.println("NINE");
        }
        else
            System.out.println("Invalid Input, please input only numbers between 1 to 9");

    }
}