package br.com.devdojo.estruturasCondicionais.ifelse;

import java.util.Scanner;

/**
 * Dado um determinado valor salário
 * e o salário for maior que 4500 imprima 30% do valor
 * se não, imprima 15% do valor
 */
public class CalculatorTaxWithCondition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Salary: US$");
        float salary = scan.nextFloat();
        float percent;
        String percentValue = null;

        if (salary > 4500.00) {
            percent = salary * 0.3f;
            percentValue = "30%";
        } else {
            percent = salary * 0.15f;
            percentValue = "15%";
        }
        System.out.print(percentValue + " percent salary US$" + percent);

        scan.close();
    }
}
