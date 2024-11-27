package com.mycompany.mavenproject26;


public class Mavenproject26 {

    public static void main(String[] args) {
         int n = 5; 
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    matriz[i][j] = 1; 
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("Triângulo superior:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}