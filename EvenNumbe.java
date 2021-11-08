package org.example;

class EvenNumber  {
    public static void main(String[] args) {
        int [] arr = new int [] {22,33,44,55,56,78};
        System.out.println("number at even position: ");
            for (int i = 0; i < arr.length; i = i+2) {
                System.out.println(arr[i]);
            }
        }
    }


