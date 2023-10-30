package aplicattion;

import entities.User;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account number: ");
        int account = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Do you want to add money to your account? (y/n)");
        User userAccount = new User(name, account);

        double amount = 0;
        if (sc.nextLine().equals("y")) {
            System.out.println("Enter amount: ");
            amount = sc.nextDouble();
            userAccount.setAmount(amount);
        } else {
            userAccount.setAmount(0);
        }

        System.out.println("User Data: ");
        System.out.println("User Account: " + userAccount.getAccount() + ", Holder: " + userAccount.getName() + ", Balance: " + userAccount.getAmount());

        System.out.println("Enter a deposit: ");
        amount = sc.nextDouble();

        userAccount.addMoney(amount);

        System.out.println("User Account: " + userAccount.getAccount() + ", Holder: " + userAccount.getName() + ", Balance: " + userAccount.getAmount());

        System.out.println("Enter a withdrawal: ");
        amount = sc.nextDouble();

        userAccount.removeMoney(amount);

        System.out.println("User Account: " + userAccount.getAccount() + ", Holder: " + userAccount.getName() + ", Balance: " + userAccount.getAmount());



        sc.close();
    //add comments to test the push //add comments to test the push
        //add comments to test the push
        //add comments to test the push //add comments to test the push
        //add comments to test the push
        //add comments to test the push
        //add comments to test the push
        //add comments to test the push
        //add comments to test the push
        //add comments to test the push
        //add comments to test the push
        //add comments to test the push



    }
}
