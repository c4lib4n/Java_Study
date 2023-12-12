package aplication;

import entities.empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        List<empregado> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int qdt = sc.nextInt();

        for (int i = 0; i < qdt; i++) {
            System.out.println("Employee # " + (i + 1));
            System.out.println("Enter the ID: ");
            int id = sc.nextInt();
            while (hasID(list, id)) {
                System.out.println("ID already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            list.add(new empregado(id, name, salary));
        }
        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        empregado emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This ID doesn't exist!");
        }else{
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employee: ");
        for (empregado x : list){
            System.out.println(x);
        }


        sc.close();
    }

    public static boolean hasID(List<empregado> list, int id) {
        empregado emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
        return emp != null;
    }

}
