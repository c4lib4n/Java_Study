package util;

public class CurrencyConverter {

    public static double valueInReal (double dollar, double quantity){
        return (dollar * quantity) + (dollar*quantity * 0.06);
    }




}
