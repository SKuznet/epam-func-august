package db;

import lombok.Getter;
import model.Department;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DepartmentTable {

    private static String name = "Departments";
    private static List<Department> departments = new ArrayList<Department>();

    public static boolean createDepartment(Department department) {
        return departments.add(department);
    }

    public static boolean updateDepartment(Department department) {
        int id = department.getId();
        if (id < departments.size()) {
            departments.add(id, department);
            return true;
        }
        return false;
    }

    public static List<Department> getDepartments() {
        return departments;
    }
}
