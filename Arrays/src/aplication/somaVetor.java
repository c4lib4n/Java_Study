package aplication;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos numeros: ");
        int n = sc.nextInt();

        double [] vect = new double[n];

        for (int i = 0; i < vect.length ; i++) {
            System.out.println("Digite os numeros: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println("Valores: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double avg = sum / n;


        System.out.println("Soma: " + sum);
        System.out.println("Media: " + avg);


    }
}
