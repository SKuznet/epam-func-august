package services;

import db.DepartmentTable;
import db.EmployeeTable;
import model.Department;
import model.Employee;

import java.util.List;

public class DepartmentService {

    public void createDepartment(String name) {
        Department department = new Department(name);
        DepartmentTable.createDepartment(department);
    }

    public void updateDepartment(Department department) {
        DepartmentTable.updateDepartment(department);
    }

    public void assignToDepartment(Employee employee, int departmentId) {
        employee.setDepartmentId(departmentId);
        EmployeeTable.updateEmployee(employee);
    }

    public List<Employee> getAllEmployees(int departmentId) {
        return EmployeeTable.getEmployeesByDepartment(departmentId);
    }
}
