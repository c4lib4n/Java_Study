package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_9 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.print("Vector size: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] age = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Type the names: ");
            names[i] = sc.next();
            System.out.print("Type the age: ");
            age[i] = sc.nextInt();
        }

        int oldest = 0;
        String name = null;
        for(int i = 0; i < n; i++){
            if (age[i] > oldest){
                oldest = age[i];
                name = names[i];
            }
        }

        System.out.print("\nOldest: " + name);

    }
}
