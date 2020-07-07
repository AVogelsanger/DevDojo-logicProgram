package br.com.devdojo.estruturasCondicionais.lacorepeticao.whiles;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String login = null;
        String password = null;
        System.out.println("Create your: login and password");

        System.out.print("Login: ");
        login = scan.next();
        System.out.print("password: ");
        password = scan.next();

        System.out.println("You agree with your data? \n" + login + " and " + password);
        System.out.println("Type it: (Y/N): ");
        char confirm = scan.next().charAt(0);

        while (confirm == 'N' || confirm == 'n'){
            System.out.print("Login: ");
            login = scan.next();
            System.out.print("password: ");
            password = scan.next();

            System.out.println("You agree with your data? \n" + login + " and " + password);
            System.out.println("Type it: (Y/N): ");
            confirm = scan.next().charAt(0);
        }
        System.out.println("Successful registration! Congratulation!!");

        /**
         *  Access to login
         */

        System.out.println("Access to login");
        boolean showScreen = true;

        while (showScreen) {
            System.out.print("Login: ");
            String enterLogin = scan.next();
            System.out.print("password: ");
            String enterPassword = scan.next();

            if (login.equals(enterLogin) && password.equals(enterPassword)) {
                System.out.println("Access allowed.");
                showScreen = false;
                break;
            }
            System.out.println("Access denied.");
        }

        scan.close();
    }
}
