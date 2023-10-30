package aplication;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Currency {
    public static void main(String[] args) {

        Locale.setDefault(Locale.UK);
        Scanner sc = new Scanner(System.in);

        double dollarPrice;
        double quantity;

        System.out.println("What is the dollar price? ");
        dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought: ");
        quantity = sc.nextDouble();

        System.out.println("Amount to be paid in reais: " + CurrencyConverter.valueInReal(dollarPrice,quantity));





    }
}
