package br.com.devdojo.estruturasCondicionais.lacorepeticao.whiles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        String condition = null;
        int num1 = 0, num2 = 0;

        do {
            for (int i = 0; i < 2; i++) {
                System.out.print("PLAYER " +(i+1)+ ": Type it a number of 1 up until 10: ");
                if ( i == 0 ) {
                    num1 = scan.nextInt();
                } else {
                    num2 = scan.nextInt();
                }
            }
            if (num1 == num2) {
                System.out.println("\nYou Win " + (num1 == num2));
            } else {
                System.out.println("\nYou Loose " + (num1 == num2));
            }

            System.out.print("Continue? choice - (Y) or (N):");
            condition = scan.next();
        } while (condition.equalsIgnoreCase("y"));

        System.out.println("\nGAME OVER");
        scan.close();
    }
}
