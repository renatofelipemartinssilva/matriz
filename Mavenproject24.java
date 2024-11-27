package com.mycompany.mavenproject24;
import java.util.HashSet;
import java.util.Scanner;

public class Mavenproject24 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        HashSet<Integer> elementos = new HashSet<>();
        boolean temRepetido = false;
        int pares = 0, impares = 0;

        System.out.println("Digite os valores da matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();

                if (elementos.contains(matriz[i][j])) {
                    temRepetido = true;
                } else {
                    elementos.add(matriz[i][j]);
                }

                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }


        System.out.println("\nA matriz possui elementos repetidos? " + (temRepetido ? "Sim" : "Não"));
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}

