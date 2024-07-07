package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number: ");
        int n = sc.nextInt();
        int[] number = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Type the numbers: ");
            number[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if (number[i] < 0) {
                 System.out.println("Negatives: " + number[i]);
            }
        }


        sc.close();
    }
}
