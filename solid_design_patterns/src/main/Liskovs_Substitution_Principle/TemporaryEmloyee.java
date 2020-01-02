package main.Liskovs_Substitution_Principle;

public class TemporaryEmloyee implements IEmployeeBonus {
    private String name;
    private String emailId;
    private String employeeType;
    private int salary;

    public TemporaryEmloyee(String name, String emailId, int salary) {
        this.name = name;
        this.emailId = emailId;
        this.salary = salary;
    }
    @Override
    public Integer bonusPercentage(int salary) {
        return (salary * 5)/100;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
