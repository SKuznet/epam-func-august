package db;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Getter
@Setter
public class EmployeeTable {
    private static String name = "Employees";
    private static List<Employee> employees = new ArrayList<Employee>();

    public static boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }

    public static boolean updateEmployee(Employee employee) {
        int id = employee.getId();
        if (id < employees.size()) {
            employees.add(id, employee);
            return true;
        }
        return false;
    }

    public static List<Employee> getEmployeesByDepartment(final int departmentId) {
        return employees.stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
    }

    public static List<Employee> getEmployees() {
        return employees;
    }
}
