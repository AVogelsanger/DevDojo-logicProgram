package br.com.devdojo.estruturasCondicionais.ifelse;

import java.util.Scanner;
/**
 * Imforme se o numero é par ou impar
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " é par");
        } else {
            System.out.println(number + " é ímpar");
        }



        scan.close();
    }
}
