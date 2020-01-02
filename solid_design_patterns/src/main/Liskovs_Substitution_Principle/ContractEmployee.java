package main.Liskovs_Substitution_Principle;

public class ContractEmployee implements IEmployee {
    private String name;
    private String emailId;
    private String employeeType;
    private int salary;

    public ContractEmployee(String name, String emailId) {
        this.name = name;
        this.emailId = emailId;
    }

    @Override
    public Integer getMinumumBonus() {
        return 5000;
    }
}
