package org.example;


public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 8, 7, 1};
        int temp, total;
        total = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Array in Ascending Order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.print(" Second Smallest Number: ");
        System.out.print(arr[total-2]);
    }
}

