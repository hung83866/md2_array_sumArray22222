package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[][] arr = {
                {3, 22, 4, 6},
                {-1, 5, 1, 0},
                {9, 100, 2, -44},
                {2, 5, 1, 6}
        };
        System.out.println("Total1 =" + sumArr2(arr));
        System.out.println("Total2 =" + sumArrrrr2(arr));

    }

    static int sumArr2(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    static int sumArrrrr2(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i+j==array.length-1) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
