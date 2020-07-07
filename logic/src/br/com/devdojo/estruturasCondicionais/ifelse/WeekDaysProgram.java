package br.com.devdojo.estruturasCondicionais.ifelse;

import java.util.Scanner;

public class WeekDaysProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] week = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        System.out.println("Type it, a number what represent one day of The week: ");
        int day = scan.nextInt();

        if (day <= 0 && day >= 8) {
            System.out.println("Invalid number!");
        } else {
            System.out.println(week[day]);
        }



        scan.close();
    }
}
