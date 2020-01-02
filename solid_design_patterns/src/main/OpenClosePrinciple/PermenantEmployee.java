package main.OpenClosePrinciple;

import static javafx.scene.input.KeyCode.M;

public class PermenantEmployee extends Employee{
    public PermenantEmployee(String name, String emailId, int salary) {
        super(name, emailId, salary);
    }

    @Override
    public Integer bonusPercentage(int salary) {
        return (salary * 10)/100;
    }


}
