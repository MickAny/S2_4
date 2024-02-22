import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1, "David", "123-46-44", 5.5),
                new Employee(2, "Mark", "312-11-77", 9.3),
                new Employee(3, "Elza", "587-17-81", 12.2),
                new Employee(4, "Robert", "813-83-03", 3.7),
                new Employee(5, "Daniel", "164-15-27", 7),
                new Employee(6, "John", "913-71-95", 3.5)
        ));

        SourceBook sourceBook = new SourceBook(employees);
        sourceBook.employees.forEach(System.out::println);



        System.out.println("-".repeat(30));
        sourceBook.searchByExperience(employees, 5.5);

        System.out.println("-".repeat(30));
        sourceBook.getPhoneByName(employees, "Elza");

        System.out.println("-".repeat(30));
        sourceBook.getEmployeeByID(employees, 4);

        System.out.println("-".repeat(30));
        sourceBook.addNewEmployee(new Employee(7, "Maya", "176-15-18", 8));
        sourceBook.employees.forEach(System.out::println);

    }
}



