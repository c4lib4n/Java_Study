package aplication;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class heights {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will be typed? ");
        int num = sc.nextInt();

        sc.nextLine();
        Person[] vect = new Person[num];


        int j =0;
        for (int i = 0; i < vect.length; i++) {

            System.out.printf("Person's data %da :\n", i + 1);
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            System.out.println("Enter the age: ");
            int age = sc.nextInt();
            System.out.println("Enter the height: ");
            double height = sc.nextDouble();

            vect[i] = new Person(name, age, height);

            if (vect[i].getAge() < 16){
                j++;
            }
            sc.nextLine();

        }

        double avgHeight = 0.0;
        for (int i = 0; i < vect.length; i++) {
            avgHeight += vect[i].getHeight();
        }


        double percentage = j * 100.0 / num;

        int p = 0;
        String [] sixteen = new String[j];
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16){
                sixteen[p] = vect[i].getName();
                p++;
            }
        }


        System.out.printf("Height Average: %.2f\n", avgHeight/num);
        System.out.println("People yeager then 16 years:" + percentage + "%");
        for (int i = 0; i < sixteen.length; i++) {
            System.out.println(sixteen[i]);
        }

    }
}
