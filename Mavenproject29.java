package com.mycompany.mavenproject29;

import javax.swing.JOptionPane;
public class Mavenproject29 {

    public static void main(String[] args) {
                int[][] mat = {
            {1, 42, 23, 14, 51},
            {22, 35, 55, 4, 12}
        };
        int x, y;

        JOptionPane.showMessageDialog(null, "****** Exibindo apenas os elementos pares da matriz ******");

        for (x = 0; x < 2; x++) {
            for (y = 0; y < 5; y++) {
                if (mat[x][y] % 2 == 0) {
                    System.out.print(mat[x][y] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println(); 
        }
    }
}
