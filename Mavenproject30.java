/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject30;

import java.util.Scanner;
public class Mavenproject30 {

    public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        Scanner scanner = new Scanner(System.in);
        char jogadorAtual = 'X';
        boolean vencedor = false;
        int jogadas = 0;

        System.out.println("Bem-vindo ao Jogo da Velha!");

        while (!vencedor && jogadas < 9) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", é sua vez!");
            System.out.print("Digite a linha (1-3): ");
            int linha = scanner.nextInt() - 1;
            System.out.print("Digite a coluna (1-3): ");
            int coluna = scanner.nextInt() - 1;
            if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida! Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            if (verificarVencedor(tabuleiro, jogadorAtual)) {
                vencedor = true;
                imprimirTabuleiro(tabuleiro);
                System.out.println("Parabéns! Jogador " + jogadorAtual + " venceu!");
                break;
            }

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }

        if (!vencedor) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Empate! Ninguém venceu.");
        }

        scanner.close();
    }

    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabuleiro[i][j]);
                if (j < 2) System.out.print(" |");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
    }

    public static boolean verificarVencedor(char[][] tabuleiro, char jogador) {

        for (int i = 0; i < 3; i++) {

            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;

            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
 
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;

        return false;
    }
}

