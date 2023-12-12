package entities;

public class empregado {

    private Integer ID;
    private String name;
    private Double salary;

    public empregado() {
    }

    public empregado(Integer ID, String name, Double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }


    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(Double percentage) {
        salary += salary * percentage / 100.0;
    }

    public String toString(){
        return ID + ", " + name + ", " + String.format("%.2f", salary);
    }
}
