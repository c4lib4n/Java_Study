package aplication;

import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Quantos elementos vai ter o Vetor? ");
        n =sc.nextInt();

        double [] vect = new double[n];
        double sum = 0;
        int j = 0;

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite os numeros: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        double media = sum /n;

        for (int i = 0; i < vect.length; i++){
            if(vect[i] < media){
                j++;
            }
        }
        int m = 0;
        double [] abaixo = new double[j];
        for (int i = 0; i < vect.length; i++){
            if(vect[i] < media){
                abaixo[m] = vect[i];
                m++;
            }
        }

        System.out.printf("Media do Vetror: %.3f\n", media);

        System.out.println("elementos abaixo da media: ");
        for (int i = 0; i < abaixo.length; i++){
            System.out.println(abaixo[i]);
        }



        sc.close();
    }

}
