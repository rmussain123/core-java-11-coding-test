package com.codingtest.demo.corejava;

public class MatrixExample {
    public static void main(String[] args) {
        int a[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int b[][] = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+b[i][j] + " ");
            }
            System.out.println();//new line
        }
    }
}
