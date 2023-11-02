package aplication;

import java.util.Locale;
import java.util.Scanner;

public class somaVetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite quantos valores cada vetor vai ter: ");
        n = sc.nextInt();

        int [] vectA = new int[n];
        int [] vectB = new int[n];
        int [] vectC = new int[n];


        for(int i = 0; i < vectA.length; i++){
            System.out.println("Digite os numeros do primeiro vetor: ");
            vectA[i] = sc.nextInt();
        }

        for (int i = 0; i < vectB.length; i++){
            System.out.println("Digite os valores do segundo vetor: ");
            vectB[i] = sc.nextInt();
        }

        for (int i =0; i < vectC.length; i++){
            vectC[i] = vectA[i] + vectB[i];
        }
        System.out.println("Vetor resultante: ");
        for (int i = 0; i < vectC.length; i++){
            System.out.println(vectC[i]);
        }

    }

}
