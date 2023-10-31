package aplication;

import java.util.Locale;
import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);






        System.out.println("How many numbers? ");
        int num = sc.nextInt();;
        sc.nextLine();

        double [] vect = new double[num];
        int neg = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Digite os numeros: ");
            vect[i] = sc.nextDouble();

            if (vect[i] < 0){
                neg ++;
            }
        }

        System.out.println(neg);

        double [] negativos = new double[neg];

        int j = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0){
                negativos[j] = vect[i];
                j++;
            }

        }

        System.out.println("Negativos: ");
        for (int i = 0; i < negativos.length; i++) {
            System.out.println(negativos[i]);
        }

    }
}
