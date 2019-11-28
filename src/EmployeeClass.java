
public class EmployeeClass {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public EmployeeClass(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getEmployeesYearly() {
        return 12 * getMonthlySalary();
    }

    public void getMonthlySalaryError() {
        if (getMonthlySalary() < 0) {
            setMonthlySalary(0);
        }
    }
}
