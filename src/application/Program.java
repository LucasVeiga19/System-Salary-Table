package application;

import entities.Attendant;
import entities.Supervisor;
import entities.Worker;

public class Program {
    public static void main(String[] args) {
        Worker manager = new Worker();
        manager.setValueSalary(1000.0);
        System.out.print("Salary Manager: ");
        System.out.println(manager.calculatedTax());

        Worker supervisor = new Supervisor();
        supervisor.setValueSalary(1000.0);
        System.out.print("Salary Supervisor: ");
        System.out.println(supervisor.calculatedTax());

        Worker attendant = new Attendant();
        attendant.setValueSalary(1000.0);
        System.out.print("Salary Attendant: ");
        System.out.println(attendant.calculatedTax());
    }
}
