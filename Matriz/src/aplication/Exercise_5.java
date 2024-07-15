package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.print("Vector size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];


        for(int i = 0; i < n; i++){
            System.out.print("Type the numbers: ");
            numbers[i] = sc.nextInt();
        }

        int bigger = 0;
        int position =0;
        for(int i = 0; i < n; i++){
            if(numbers[i] > bigger){
                bigger = numbers[i];
                position = i;
            }
        }

        System.out.println("Biggest number: " + bigger);
        System.out.print("Biggest number position: " + position);



        sc.close();

    }
}
