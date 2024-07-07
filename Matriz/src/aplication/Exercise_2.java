package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numers: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double add = 0;

        for (int i = 0; i < n; i++ ){
            System.out.print("Type the numbers: ");
            vect[i] = sc.nextDouble();
            add += vect[i];
        }
        double avg = add / n;

        System.out.print("Numbers: ");
        for(int i = 0; i < n; i++){
            System.out.print(vect[i] + ", ");
        }
        System.out.println();
        System.out.println("Addition: " + add);
        System.out.print("Avarege: " + avg);


        sc.close();

    }

}
