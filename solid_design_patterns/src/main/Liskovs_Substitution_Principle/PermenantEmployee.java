package main.Liskovs_Substitution_Principle;

public class PermenantEmployee implements IEmployeeBonus {
    private String name;
    private String emailId;
    private String employeeType;
    private int salary;

    public PermenantEmployee(String name, String emailId, int salary) {
        this.name = name;
        this.emailId = emailId;
        this.salary = salary;
    }

    @Override
    public Integer bonusPercentage(int salary) {
        return (salary * 10)/100;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
