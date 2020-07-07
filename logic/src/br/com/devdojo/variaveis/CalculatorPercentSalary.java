package br.com.devdojo.variaveis;

/**
 * Crie uma classe que calcule uma determinada porcentagem de um dado salário
 * Criar uma classe
 * aceitar um valor de entrada
 * Definir o valor da porcentagem
 * Calcular a porcentagem
 */
public class CalculatorPercentSalary {
    public static void main(String[] args) {
        double salary = 2500.00;
        double percent = 30;
        double percentSalary = salary * percent / 100;
        System.out.println("US$" + percentSalary);
    }
}
