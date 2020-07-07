package br.com.devdojo.variaveis;

/**
 * Crie uma variável que irá guardar o valor de um salário
 * Calcule a porcentagem desse salário, sendo os valores da porcentagem
 * 30%
 * 15%
 * 5
 * A cada vez que você calcular guarde o resultado em uma variável
 * Imprima o resultado e reutilize a variável que guarda o resultado para o calculo
 */
public class ReusingVariables {
    public static void main(String[] args) {
        double salary = 5000.00;
        double percent30 = 30;
        double percent15 = 15;
        double percent5 = 5;
        double percentSalary = salary * percent30 / 100;
        System.out.println("30% - US$" + percentSalary);
        percentSalary = salary * percent15 / 100;
        System.out.println("15% - US$" + percentSalary);
        percentSalary = salary * percent5 / 100;
        System.out.println("5% - US$" + percentSalary);
    }
}
