package aplication;

import entities.Grade;

import java.util.Locale;
import java.util.Scanner;

public class Studanty {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        Grade scores = new Grade();

        System.out.println("Enter the Student name: ");
        scores.name = sc.nextLine();

        System.out.println("Enter the First grade: ");
        scores.a = sc.nextDouble();
        System.out.println("Enter the Second grade: ");
        scores.b = sc.nextDouble();
        System.out.println("Enter the third grade: ");
        scores.c = sc.nextDouble();

        System.out.println("Final Grade: " + scores.finalGrade());
        if (scores.finalGrade() < 60 ){
            System.out.println("FAILED");
            System.out.println("Missing: " + scores.missingPoints() + " POINTS");
        }else{
            System.out.println("PASS");}
    }

}
