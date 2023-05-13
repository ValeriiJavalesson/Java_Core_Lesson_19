import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Employee em1 = new Employee("Sarrah", 1, 3200.5);
        System.out.println("Створили новий об’єкт Employee: "+ em1.toString());
        File employees = new File("employees.txt");
        System.out.println("Проводимо серіалізацію...");
        Methods.serialize(employees, em1);
        System.out.println("Тепер проводимо десеріалізацію:");
        System.out.println(Methods.deserealize(employees));
        System.out.println();


        ArrayList<Employee> employeesList = new ArrayList<>();
        File employList = new File("employeesList.txt");
        employeesList.add(new Employee("Victor", 20, 1200.78));
        employeesList.add(new Employee("Alex", 21, 366.12));
        employeesList.add(new Employee("Boris", 22, 4401.66));
        employeesList.add(new Employee("Lee", 23, 4100.0));
        employeesList.add(new Employee("Danny", 24, 789.12));
        employeesList.add(new Employee("Kevin", 25, 999.88));
        System.out.println("Створили нову колекцію об’єктів Employee: ");
        for (Employee e : employeesList) {
            System.out.println(e.toString());
        }
        System.out.println("Проводимо серіалізацію...");
        Methods.serialize(employList, employeesList);
        System.out.println("Тепер проводимо десеріалізацію:");
        ArrayList<Employee> arrivedList = (ArrayList<Employee>) Methods.deserealize(employList);
        for (Employee e : arrivedList) {
            System.out.println(e.toString());
        }
    }
}
