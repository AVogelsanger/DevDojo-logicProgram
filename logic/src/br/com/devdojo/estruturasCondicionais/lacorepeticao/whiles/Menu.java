package br.com.devdojo.estruturasCondicionais.lacorepeticao.whiles;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("1ª Calcular imposto ");
            System.out.println("2ª Depositar salário ");
            System.out.println("3ª Sair ");
            option = scan.nextInt();
        }

        System.out.println("Fim");

        scan.close();
    }
}
