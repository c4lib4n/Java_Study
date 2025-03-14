package aplication;

import java.util.Locale;
import java.util.Scanner;

public class highestPosition {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("How many numbers are you going to type? ");
        n = sc.nextInt();

        int [] vect = new int[n];
        int highest = 0;
        int position = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.println("Enter the numbers: ");
            vect[i] = sc.nextInt();
                if (highest < vect[i]){
                    highest = vect[i];
                    position = i;
                }
        }

        System.out.println("Highest Value: " + highest);
        System.out.println("Position: " + position);


    }
}
