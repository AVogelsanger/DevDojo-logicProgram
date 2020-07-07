package br.com.devdojo.estruturasCondicionais.ifelse;

import br.com.devdojo.model.Swimmer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Torneio de Natação
 */
public class SwimmingTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Swimmer> swimmers = new LinkedList<>();

        System.out.print("How many competitors? ");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Swimmer " + (i+1) + "º: ");
            System.out.print("Name: ");
            String name = scan.next();
            System.out.print("Age: ");
            int age = scan.nextInt();

            if (age <= 10){
                String nivel = "Infatil";
                swimmers.add(new Swimmer(name, age, nivel));
            } else if (age <= 15) {
                String nivel = "Juvenil";
                swimmers.add(new Swimmer(name, age, nivel));
            } else if(age <= 19){
                String nivel = "Pré-adulto";
                swimmers.add(new Swimmer(name, age, nivel));
            } else {
                String nivel = "Adulto";
                swimmers.add(new Swimmer(name, age, nivel));
            }
        }

        for (Swimmer swimmer : swimmers) {
            System.out.println(swimmer);
        }


        scan.close();
    }
}
