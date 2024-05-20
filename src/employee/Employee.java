package employee;

public class Employee {
    private final String phoneNumber;
    private final String personnelNumber;
    private final String name;
    private final int experience;

    public Employee(String phoneNumber, String personnelNumber, String name, int experience) {
        this.phoneNumber = phoneNumber;
        this.personnelNumber = personnelNumber;
        this.name = name;
        this.experience = experience;
    }

    // Getters
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPersonnelNumber() {
        return personnelNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
