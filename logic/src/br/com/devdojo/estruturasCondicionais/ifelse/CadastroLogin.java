package br.com.devdojo.estruturasCondicionais.ifelse;

import br.com.devdojo.model.User;

import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String name = scan.next();

        if (name.equals("") ||
                name.equalsIgnoreCase("admin") ||
                    name.equalsIgnoreCase("administrator")) {
            System.out.println(name + " no allow, create a new user!");
        } else {
            User u = new User(name);
            System.out.println(u.getName() + " cadastrado com sucesso!");
        }


        scan.close();
    }
}
