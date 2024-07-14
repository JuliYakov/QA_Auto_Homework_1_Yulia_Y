import com.example.employees.*;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Олена", 26, 3000),
                new Developer("Вадим", 25, 5000),
                new Designer("Олександр", 23, 2000)
        };

        for (Employee emp : employees) {
            emp.performJob();
            emp.describeRole();
            emp.describeRole("Age: " + emp.getAge() + ", Salary: $" + (int) emp.getSalary());
            System.out.println();  // Separate each employee's details
        }
    }
}
