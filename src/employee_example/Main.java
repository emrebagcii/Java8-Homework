package employee_example;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Kadir", 30, "Java Developer"));
        employee.add(new Employee("Emre", 30, "BI Developer"));
        employee.add(new Employee("Ahmet", 25, "DevOps"));
        employee.add(new Employee("Ayşe", 21, "Bussines Analyst"));
        employee.add(new Employee("Mehmet", 40, "SQL DBA"));
        employee.add(new Employee("Ali", 21, ".Net Developer"));

        Map<Integer, List<Employee>> ageGroup = employee.stream()
                .collect(Collectors.groupingBy(Employee::getAge));

        ageGroup.forEach((age, employeeList) -> {
            System.out.println("*****");
            System.out.println("Yaş: "+age);
            employeeList.forEach(e -> {
                System.out.println(e.getName());
            });
        });
    }
}
