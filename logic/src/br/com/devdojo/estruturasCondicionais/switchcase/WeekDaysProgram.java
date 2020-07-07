package br.com.devdojo.estruturasCondicionais.switchcase;

import java.util.Scanner;

public class WeekDaysProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] week = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        System.out.print("Type it, a number what represent one day of The week: ");
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println(week[0]);
                break;
            case 2:
                System.out.println(week[1]);
                break;
            case 3:
                System.out.println(week[2]);
                break;
            case 4:
                System.out.println(week[3]);
                break;
            case 5:
                System.out.println(week[4]);
                break;
            case 6:
                System.out.println(week[5]);
                break;
            case 7:
                System.out.println(week[6]);
                break;
            default:
                System.out.println("Number invalid.");
        }




        scan.close();
    }
}
