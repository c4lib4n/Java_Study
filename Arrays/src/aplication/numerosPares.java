package aplication;

import java.util.Locale;
import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Quantos numeros vai digitar? ");
        n = sc.nextInt();
        int [] vect = new int[n];

        int j = 0;

        for (int i = 0; i < vect.length; i++) {
           System.out.print("Digite os numeros: ");
            vect[i] = sc.nextInt();
                if (vect[i] % 2 ==0){
                    j++;
                }

        }
        int [] pares = new int[j];
        int m = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0){
                pares[m] = vect[i];
                m++;
            }
        }

        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }

        System.out.print("Quantidade de pares: " + m);


    }

}
