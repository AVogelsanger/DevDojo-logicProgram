package br.com.devdojo.arrays.unidimensional;

import br.com.devdojo.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntroArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many students: ");
        int studentsQuantity = scan.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentsQuantity; i++) {
            System.out.print("\nRm: ");
            int rm = scan.nextInt();
            System.out.print("Name: ");
            String name = scan.next() + scan.nextLine();

            double sum = 0.0;
            Double[] tests = new Double[4];
            for (int j = 0; j < 4; j++) {
                System.out.print((i+1)+"º quarter: ");
                tests[j] = scan.nextDouble();
                sum += tests[j];
            }

            double average = sum/4;
            students.add(new Student(rm, name, tests, average));

        }
        for (Student student : students) {
            System.out.println("\n"+student);
        }

        scan.close();
    }
}
