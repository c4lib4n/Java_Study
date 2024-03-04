package aplicattion;

import entities.User;

import java.util.Locale;
import java.util.Scanner;

public class BankProblem {

    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account number: ");
        int account = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Do you want to add money to your account? (y/n)");
        User userAccount;

        double amount;
        if (sc.nextLine().equals("y")) {
            System.out.println("Enter amount: ");
            amount = sc.nextDouble();
            userAccount = new User(name, account, amount);
        } else {
            userAccount = new User(name, account);
        }

        System.out.println("User Data: ");
        System.out.println(userAccount);

        System.out.println("Enter a deposit: ");
        amount = sc.nextDouble();

        userAccount.addMoney(amount);

        System.out.println(userAccount);

        System.out.println("Enter a withdrawal: ");
        amount = sc.nextDouble();

        userAccount.removeMoney(amount);

        System.out.println(userAccount);



        sc.close();


    }
}
