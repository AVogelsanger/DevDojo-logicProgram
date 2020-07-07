package br.com.devdojo.estruturasCondicionais.lacorepeticao.whiles;

public class OddWithWhile {
    public static void main(String[] args) {

        int num = 0;
        while (num <= 100) {
            if (num % 2!= 0) {
                System.out.print(" " + num);
            }
            num++;
        }
    }
}
