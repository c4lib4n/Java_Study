package entities;

public class User {

    private String name;
    private final int account;
    private double amount;


    public User(String nome, int account) {
        this.name = nome;
        this.account = account;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public double addMoney(double amount) {
        return this.amount += amount;
    }

    public double removeMoney(double amount) {
        return this.amount -= amount + 5.00;
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }


    //ghg
}
