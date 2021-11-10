package org.example;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int a = 10, b = 25, c =30;
        int [] arr = new int[4];
        arr[0] = a+(b*c);
        System.out.println("a+(b*c) = "+ arr[0]);
        arr[1] = c+(a/b);
        System.out.println("c+(a/b) = " + arr[1]);
        arr[2] = (a%b)+c;
        System.out.println("(a%b)+c = " + arr[2]);
        arr[3] = (a*b)+c;
        System.out.println("(a*b)+c = " + arr[3]);
        Arrays.sort(arr);
        System.out.println("Minimum = " + arr[0]);
        System.out.println("Maximum = " + arr[arr.length - 1]);
    }
}

