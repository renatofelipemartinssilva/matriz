package com.mycompany.mavenproject25;

import java.util.Scanner;
public class Mavenproject25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matriz = new double[4][4];

        System.out.println("Digite os valores da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\n\nDiagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3 - i] + " ");
        }
    }
}
