package HomeWorwMisha1;

public class Employee {
    private String lastName;
    private String firstName;
    private String position;
    private int salaryPerHour;

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPosition() {
        return position;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public Employee(String lastName, String firstName, String position, int salaryPerHour) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.salaryPerHour = salaryPerHour;
    }

    public Employee(String lastName, String firstName, String position) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
    }

    public int infoSalaryPerDay() {
        int salaryPerDay = salaryPerHour * 8;
        return salaryPerDay;
    }

    public String shortIfoAboutEmployee() {
        return lastName + " " + firstName + " " + position;
    }
}
