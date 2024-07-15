package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_4 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.print("Vector size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Type the numbers: ");
            numbers[i] = sc.nextInt();
        }

        int evenQuantity = 0;
        System.out.print("Numbers even: ");
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(" " + numbers[i]);
                evenQuantity++;
            }
        }

        System.out.print("\n" + evenQuantity);


        sc.close();
    }
}
