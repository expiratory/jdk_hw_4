package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDirectory {
    private final List<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> findByExperience(int experience) {
        return employees.stream()
                .filter(employee -> employee.getExperience() == experience)
                .collect(Collectors.toList());
    }

    public List<String> getPhoneByName(String name) {
        return employees.stream()
                .filter(employee -> employee.getName().equals(name))
                .map(Employee::getPhoneNumber)
                .collect(Collectors.toList());
    }

    public Employee findByPersonnelNumber(String personnelNumber) {
        return employees.stream()
                .filter(employee -> employee.getPersonnelNumber().equals(personnelNumber))
                .findFirst()
                .orElse(null);
    }
}
