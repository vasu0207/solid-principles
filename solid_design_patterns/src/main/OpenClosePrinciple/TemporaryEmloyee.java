package main.OpenClosePrinciple;

public class TemporaryEmloyee extends Employee {
    public TemporaryEmloyee(String name, String emailId, int salary) {
        super(name, emailId, salary);
    }

    @Override
    public Integer bonusPercentage(int salary) {
        return (salary * 5)/100;
    }
}
