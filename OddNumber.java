package org.example;

public class OddNumber {
        public static void main(String[] args) {
            int [] arr = new int [] {22,33,44,55,56,78};
            System.out.println(" Number at odd position: ");
            for (int i = 1; i < arr.length; i = i+2) {
                System.out.println(arr[i]);
            }
        }
    }

