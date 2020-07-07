package br.com.devdojo.arrays.multidimensional;

import java.util.Scanner;

public class PrincipalDiagonal {
    public static void main(String[] args) {
        // faça a multiplicação dos elementos da diagonal principal de uma matriz quadrada.
        Scanner scan = new Scanner(System.in);
        int[][] diagonalPrincipal = new int[3][3];
        int result = 1;

        for (int i = 0; i < diagonalPrincipal.length; i++) {
            for (int j = 0; j < diagonalPrincipal[i].length; j++) {
                System.out.print("Type it numbers - ["+i+"]["+j+"]: ");
                diagonalPrincipal[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < diagonalPrincipal.length; i++) {
            for (int j = 0; j < diagonalPrincipal[i].length; j++) {
                if (i == j) {
                    result *= diagonalPrincipal[i][j];
                }
            }
        }

        System.out.println(result);

        scan.close();
    }
}
