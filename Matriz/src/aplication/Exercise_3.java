package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.print("What's the vector size ?");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        double add = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Type the name: ");
            names[i] = sc.next();
            System.out.println("Type the age: ");
            age[i] = sc.nextInt();
            System.out.println("Type the height: ");
            height[i] = sc.nextDouble();
            add += height[i];
        }
        double heightAvg;
        heightAvg = add / n;
        System.out.printf("Height average: %.2f%n", heightAvg);

        double underSixteen = 0.0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                underSixteen++;
            }
        }

        System.out.println("Average under 16 years old : " + (underSixteen / n) * 100);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.printf("%s\n", names[i]);
            }
        }


        sc.close();

    }


}
