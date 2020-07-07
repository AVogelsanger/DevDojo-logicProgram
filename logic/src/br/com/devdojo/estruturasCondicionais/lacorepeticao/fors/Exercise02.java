package br.com.devdojo.estruturasCondicionais.lacorepeticao.fors;

public class Exercise02 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " - Times table (tabuada).");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " + (i*j));
            }
            System.out.println(" ");
        }
    }
}
