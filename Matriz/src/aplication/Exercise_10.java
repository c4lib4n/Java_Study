package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.print("Vector size: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] scoreQ1 = new double[n];
        double[] scoreQ2 = new double[n];


        for(int i = 0; i < n; i++){
            System.out.print("Enter the name: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            System.out.print("Enter the first score: ");
            scoreQ1[i] = sc.nextDouble();
            System.out.print("Enter the second score: ");
            scoreQ2[i] = sc.nextDouble();
        }

        double avg;

        for (int i=0; i<n; i++) {
            avg = (scoreQ1[i] + scoreQ2[i]) / 2;

            if (avg >= 6.0){
                System.out.println("Approved students:  " + names[i]);
            }
        }

    }
}
