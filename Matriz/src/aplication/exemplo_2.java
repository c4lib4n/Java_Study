package aplication;

import java.util.Locale;
import java.util.Scanner;

public class exemplo_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);


        int n;
        System.out.println("Size of the Vector: ");
        n = sc.nextInt();

        String[] name = new String[n];
        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Product name: ");
            name[i] = sc.nextLine() ;
            sc.nextLine();
           System.out.print("Product price: ");
            vect[i] = sc.nextDouble();

        }
        double avg = 0;
        for(int i = 0; i < n; i++){
            avg += vect[i];
        }

        System.out.printf("Avarege price: %.2f%n", avg/n );




        sc.close();
    }

}
