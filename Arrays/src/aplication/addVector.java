package aplication;

import java.util.Locale;
import java.util.Scanner;

public class addVector {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter how many values each vector will have: ");
        n = sc.nextInt();

        int [] vectA = new int[n];
        int [] vectB = new int[n];
        int [] vectC = new int[n];


        for(int i = 0; i < vectA.length; i++){
            System.out.println("Enter the numbers of the first vector: ");
            vectA[i] = sc.nextInt();
        }

        for (int i = 0; i < vectB.length; i++){
            System.out.println("Enter the numbers of the second vector: ");
            vectB[i] = sc.nextInt();
        }

        for (int i =0; i < vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
        }
        System.out.println("Resulting vector: ");
        for (int i = 0; i < vectC.length; i++){
            System.out.println(vectC[i]);
        }

    }

}
