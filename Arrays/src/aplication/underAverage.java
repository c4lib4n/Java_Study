package aplication;

import java.util.Locale;
import java.util.Scanner;

public class underAverage {

    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("How many elements will the Vector have? ");
        n =sc.nextInt();

        double [] vect = new double[n];
        double sum = 0;
        int j = 0;

        for (int i = 0; i < vect.length; i++){
            System.out.println("Enter the numbers: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        double average = sum /n;

        for (int i = 0; i < vect.length; i++){
            if(vect[i] < average){
                j++;
            }
        }
        int m = 0;
        double [] under = new double[j];
        for (int i = 0; i < vect.length; i++){
            if(vect[i] < average){
                under[m] = vect[i];
                m++;
            }
        }

        System.out.printf("Vector Average: %.3f\n", average);

        System.out.println("Elements below average: ");
        for (int i = 0; i < under.length; i++){
            System.out.println(under[i]);
        }



        sc.close();
    }

}
