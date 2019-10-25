package model;

import db.DepartmentTable;
import lombok.Getter;

@Getter
public class Department {
    private int id;
    private String name;

    public Department(String name) {
        this.id = DepartmentTable.getDepartments().size();
        this.name = name;
    }
}
