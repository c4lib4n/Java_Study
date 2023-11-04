package aplication;

import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Quantos numeros vai digitar? ");
        n = sc.nextInt();

        int [] vect = new int[n];
        int maior = 0;
        int posicao = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite os numeros: ");
            vect[i] = sc.nextInt();
                if (maior < vect[i]){
                    maior = vect[i];
                    posicao = i;
                }
        }

        System.out.println("Maior Valor: " + maior);
        System.out.println("Posicao: " + posicao);


    }
}
