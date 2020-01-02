package main.Liskovs_Substitution_Principle;

public abstract class Employee  {
    private String name;
    private String emailId;
    private String employeeType;
    private int salary;
    //Here if we have give employeeType if when creating new employee record, so we would move employee Type to new class
   // and calculate the bonus there
    public Employee(String name, String emailId, int salary) {
        this.name = name;
        this.emailId = emailId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /*public Integer bonusPercentage(int salary){
            if(employeeType.equals("P")){
                return 10;

            }
                return 0;


        }
    */
    public abstract Integer bonusPercentage(int salary);

    public static void main(String[] args) {
    System.out.println("Entered Main");
        IEmployeeBonus employee = new PermenantEmployee("one", "1@you.com",10000);
        IEmployeeBonus employee1 = new TemporaryEmloyee("tw0", "2@you.com",10000);
        System.out.println(employee.bonusPercentage(10000));
        System.out.println(
                employee1.bonusPercentage(10000));
        IEmployee employee3 = new ContractEmployee("one", "1@you.com");
        System.out.println(employee3.getMinumumBonus());
    System.out.println("Exist Main");
    }
}
