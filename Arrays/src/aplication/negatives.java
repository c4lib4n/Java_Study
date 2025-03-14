package aplication;

import java.util.Locale;
import java.util.Scanner;

public class negatives {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);


        System.out.println("How many numbers? ");
        int num = sc.nextInt();;
        sc.nextLine();

        double [] vect = new double[num];
        int neg = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the numbers: ");
            vect[i] = sc.nextDouble();

            if (vect[i] < 0){
                neg ++;
            }
        }

        System.out.println(neg);

        double [] negatives = new double[neg];

        int j = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0){
                negatives[j] = vect[i];
                j++;
            }

        }

        System.out.println("Negatives: ");
        for (int i = 0; i < negatives.length; i++) {
            System.out.println(negatives[i]);
        }

        sc.close();
    }

}
