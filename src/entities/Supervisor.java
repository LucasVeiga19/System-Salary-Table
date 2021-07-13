package entities;

public class Supervisor extends Worker {
    public double calculatedTax() {
        return this.getValueSalary() * 0.5;
    }
}
