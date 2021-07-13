package entities;

public class Worker {
    private double valueSalary;

    public double getValueSalary() {
        return valueSalary;
    }

    public void setValueSalary(double valueSalary) {
        this.valueSalary = valueSalary;
    }

    public double calculatedTax() {
        return this.valueSalary * 0.1;
    }
}
