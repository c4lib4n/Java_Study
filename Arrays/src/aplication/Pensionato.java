package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args){
        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rent? ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int numRoom = sc.nextInt();

        }



    }






}
