package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.print("Vector size: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        System.out.print("Type the number for the first vector: ");
        for(int i = 0; i < n; i++){
            System.out.print("Type next number: ");
            A[i] = sc.nextInt();
        }

        System.out.print("\nType the number for the vector B: ");
        for (int i = 0; i <n; i++){
            System.out.print("Type next number: ");
            B[i] = sc.nextInt();
        }

        int[] C = new int[n];

        for(int i = 0; i < n; i++){
            C[i] = A[i] + B[i];
        }

        System.out.println("Vector A + Vector B: ");
        for (int i = 0; i < n; i++){
            System.out.print("\n" + C[i]);
        }

        sc.close();
    }
}
