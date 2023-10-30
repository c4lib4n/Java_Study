package entities;

public class Salary {

    public String name;
    public double salary;
    public double tax;
    public double liquidySlary(){
        return salary - tax;
    }

    public void increaseSalary(double per){
        salary += salary * per /100.00;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", liquidySlary());
    }

}
