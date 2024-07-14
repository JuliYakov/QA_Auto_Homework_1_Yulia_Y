import com.example.employees.*;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("Olena", 26, 3000),
                new Developer("Vadim", 25, 5000),
                new Designer("Oleksandr", 23, 2000)
        };

        for (Employee emp : employees) {
            emp.performJob();
            emp.describeRole();
            emp.describeRole("Age: " + emp.getAge() + ", Salary: $" + (int) emp.getSalary());
            System.out.println();
        }
    }
}
