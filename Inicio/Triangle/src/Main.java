import entities.Triagle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);
        Triagle retangule = new Triagle();

        System.out.println("Enter the Width: ");
        retangule.width = sc.nextDouble();

        System.out.println("Enter the height: ");
        retangule.height = sc.nextDouble();

        System.out.printf("Area: %.2f", retangule.area());
        System.out.println();
        System.out.printf("Perimeter: %.2f", retangule.perimeter());
        System.out.println();
        System.out.printf("Diagonal: %.2f", retangule.diagonal());




        sc.close();
    }



}