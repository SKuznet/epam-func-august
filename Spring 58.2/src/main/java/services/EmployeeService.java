package services;

import db.EmployeeTable;
import model.Employee;

public class EmployeeService {

    public void createEmployee(String name, int department) {
        Employee employee = new Employee(name);
        employee.setDepartmentId(department);
        EmployeeTable.addEmployee(employee);
    }

    public void updateEmployee(Employee employee) {
        EmployeeTable.updateEmployee(employee);
    }
}
