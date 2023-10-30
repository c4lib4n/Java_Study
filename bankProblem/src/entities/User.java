package entities;

public class User {

    private String name;
    private final int account;
    private double balance;


    public User(String nome, int account) {
        this.name = nome;
        this.account = account;
    }

    public User(String name, int account, double initialValue) {
        this.name = name;
        this.account = account;
        addMoney(initialValue);
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public int getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        balance += amount;
    }

    public void removeMoney(double amount) {
        balance -= amount + 5.00;
    }

    public String toString(){
        return "Account: " + account + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);

    }






}
