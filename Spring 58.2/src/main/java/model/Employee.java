package model;

import db.EmployeeTable;
import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class Employee {
    private int id;
    private String name;
    private int departmentId;

    public Employee(String name) {
        this.id = EmployeeTable.getEmployees().size();
        this.name = name;
    }
}
