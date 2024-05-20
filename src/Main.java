import employee.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        directory.addEmployee(new Employee("+1234567890", "001", "Alice", 5));
        directory.addEmployee(new Employee("+0987654321", "002", "Bob", 10));
        directory.addEmployee(new Employee("+1122334455", "003", "Charlie", 5));

        List<Employee> employeesWithFiveYearsExperience = directory.findByExperience(5);
        System.out.println(employeesWithFiveYearsExperience);

        List<String> phoneNumbersOfAlice = directory.getPhoneByName("Alice");
        System.out.println(phoneNumbersOfAlice);

        Employee bob = directory.findByPersonnelNumber("002");
        System.out.println(bob);
    }
}
