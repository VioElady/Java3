
public class EmployeeTest {
    public static void main(String[] args) {

        EmployeeClass employee1 = new EmployeeClass("Enly", "Wenn", 10000);
        EmployeeClass employee2 = new EmployeeClass("Vilma", "Sarey", 20000);
        EmployeeClass employee3 = new EmployeeClass("Katy", "Vilej", 5000);


        System.out.println("Enly Wenn has monthly salary : " + employee1.getMonthlySalary());
        System.out.println("Vilma Sarey has monthly salary : " + employee2.getMonthlySalary());
        System.out.println("Katy Vilej has monthly salary: " + employee3.getMonthlySalary());


        employee1.setMonthlySalary(1.1 * employee1.getMonthlySalary());
        employee2.setMonthlySalary(1.1 * employee2.getMonthlySalary());
        employee3.setMonthlySalary(1.1 * employee3.getMonthlySalary());


    }
}
