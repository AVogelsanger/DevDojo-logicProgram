package br.com.devdojo.estruturasCondicionais.ifelse;

import br.com.devdojo.model.UserMilitary;
import br.com.devdojo.service.BrazilEnlistMilitary;
import br.com.devdojo.service.EnlistService;

import java.util.Scanner;

public class EnlistmentMilitary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Name user: ");
        String name = scan.next();
        System.out.print("Sex user: ");
        char sex = scan.next().charAt(0);
        System.out.print("Age user: ");
        int age = scan.nextInt();

        UserMilitary u = new UserMilitary(name, sex, age);
        u.toString();

        EnlistService serviceMilitary = new BrazilEnlistMilitary();
        serviceMilitary.permission(sex, age);



        scan.close();
    }
}
