package br.com.devdojo.service;

public class BrazilEnlistMilitary implements EnlistService{

    @Override
    public void permission(char sex, int age) {
        if ((sex == 'M' || sex == 'F') && age < 18) {
            System.out.println("Enlistment military without permit!");
        } else if (sex == 'M' && age >= 18) {
            System.out.println("Mandatory Enlistment!");
        } else if (sex == 'F' && age >= 18) {
            System.out.println("Do you wish to enlist in the military?");
        }
    }
}
