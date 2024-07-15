package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.print("Vector size: ");
        int n = sc.nextInt();

        double[] number = new double[n];

        for(int i = 0; i < n; i++){
            System.out.print("Type the numbers: ");
            number[i] = sc.nextDouble();
        }

        double add = 0.0;
        for(int i = 0; i < n; i++){
           add += number[i];
        }

        double avg = add/n;

        System.out.printf("Average: %.3f%n", avg);

        System.out.println("Elements under the average: ");
        for(int i = 0; i < n; i++){
            if (number[i] < avg){
                System.out.printf("%.2f%n", number[i]);
            }
        }


        sc.close();
    }
}
