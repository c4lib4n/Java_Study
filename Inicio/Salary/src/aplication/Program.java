package aplication;

import entities.Salary;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        Salary employee = new Salary();

        System.out.println("Enter the employee name: ");
        employee.name = sc.nextLine();

        System.out.println("Enter gross Salary: ");
        employee.salary = sc.nextDouble();

        System.out.println("Enter the Tax: ");
        employee.tax = sc.nextDouble();


        System.out.printf(" Employee: " + employee);
        System.out.println();
        System.out.println("Which percentage to increase salary: ");
        double per = sc.nextDouble();
        employee.increaseSalary(per);

        System.out.println();
        System.out.printf("Updated data: " + employee);

        sc.close();

    }
}
