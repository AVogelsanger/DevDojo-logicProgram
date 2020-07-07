package br.com.devdojo.estruturasCondicionais.ifelse;

import java.util.Scanner;

/**
 * Receba uma idade como entrada
 * Se idade for maior que 18 imprima "Adulto"
 * Se não imprima "Ainda Não é Adulto"
 */
public class VerifyAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a idade: ");
        int age = scan.nextInt();

        if (age >= 18){
            System.out.println("Adulto.");
        } else {
            System.out.println("Ainda não é adulto!");
        }

        scan.close();
    }
}
