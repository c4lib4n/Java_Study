package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_8 {
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

        int add = 0;
        int evenAmount = 0;
        for(int i = 0; i < n; i++){
            if(numbers[i] % 2 == 0){
                add += numbers[i];
                evenAmount++;
            }
        }

        double avg = (double)add / evenAmount;

        if(evenAmount == 0){
            System.out.print("None even numbers!");
        }else{
            System.out.printf("Even average: %.2f%n", avg);
        }

        sc.close();
    }
}
