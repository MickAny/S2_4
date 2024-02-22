import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SourceBook {
    List<Employee> employees;
    public SourceBook(List<Employee> employees)
    {
        this.employees = employees;
    }

    //Я читал задание. Но никто не будет искать сотрудника по стажу 2 года, 3 месяца и 7 дней. Условно
    //Список людей со стажем превышающим заданный - наиболее рациональное решение
    public void searchByExperience(List<Employee> employees, double exp){
        List<Employee> modifiedList = new ArrayList<>();
        for (Employee e: employees) {
            if(e.getExp() > exp){
                modifiedList.add(e);
            }
        }
        modifiedList.sort(Comparator.comparing(Employee::getExp));
        modifiedList.forEach(System.out::println);
    }

    public void getPhoneByName(List<Employee> employees, String name){
        for (Employee e: employees) {
            if (e.getName().equals(name)){
                System.out.println(name + " " + e.getPhoneNumber());
                //System.out.println(e);
            }
        }
    }
    public void getEmployeeByID(List<Employee> employees, int id){
        for (Employee e: employees) {
            if (e.getID() == id){
                System.out.println(e);
                return;
            }
        }
        System.out.println("Сотрудника с таким ID не существует");
    }

    public void addNewEmployee(Employee employee){
        employees.add(employee);
        System.out.println("Сотрудник " + employee.getName() + " был успешно добавлен");
    }

}