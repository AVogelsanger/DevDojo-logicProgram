package br.com.devdojo.estruturasCondicionais.ifelse;

import java.util.Scanner;

/**
 * Imposto de renda
 */
public class IncomeTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Salary US$");
        double salary = scan.nextDouble();
        double income = 0;

        if (salary <= 1903.98){
            System.out.println("Isento");
        } else if (salary <= 2826.65){
            income = salary * 0.075;
        } else if (salary <= 3751.05){
            income = salary * 0.15;
        } else if (salary <= 4664.68){
            income = salary * 0.225;
        } else {
            income = salary * 0.275;
        }
        System.out.print("Parcela a deduzir US$" + income);

        scan.close();
    }
}
