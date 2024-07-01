package aplication;

import java.util.Locale;
import java.util.Scanner;

public class example {

    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.println("Vector lenght: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0;i < n; i++){
            System.out.println("Type the values: ");
            double x = sc.nextDouble();
            vect[i] = x;
        }
        double avr = 0;
        for (int i = 0; i < n; i++){
            avr += vect[i];
        }
        System.out.println();
        System.out.printf("Avarege Height: %.2f%n", avr/n);

        sc.close();


    }
}
