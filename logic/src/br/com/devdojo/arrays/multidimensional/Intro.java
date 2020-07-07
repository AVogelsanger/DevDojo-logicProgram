package br.com.devdojo.arrays.multidimensional;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arrayMulti = new int[2][3];

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.print("Type it value of position ["+i+"]["+j+"] ");
                arrayMulti[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.println("["+i+"]["+j+"]= " + arrayMulti[i][j]);
            }
        }


        scan.close();
    }
}
