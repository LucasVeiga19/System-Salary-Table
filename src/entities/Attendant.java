package entities;

public class Attendant extends Worker{
    public double calculatedTax() {
        return this.getValueSalary() * 0.01;
    }
}
