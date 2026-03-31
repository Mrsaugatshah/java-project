
//write a java program Create a class Person with attributes name and age, and a method display(). Derive a class
// Employee from Person with additional attributes employeeId and salary. Use constructors
// and override the display() method to include all details.
import java.util.Scanner;

class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("\name:" + name);
        System.out.println("Age:" + age);
    }
}

class employee extends person {
    int employeeId, salary;

    employee(int employeeId, String name, int age, int salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void display() {
        super.display();
        System.out.println("Id:" + employeeId);
        System.out.println("salary:" + salary);
    }
}

public class EmployeeInformation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age, id, salary;
        System.out.print("employee id:");
        id = sc.nextInt();
        System.out.print("employy name:");
        name = sc.next();
        System.out.print("salary:");
        salary = sc.nextInt();

        employee obj = new employee(id, name, age, salary);
        obj.display();

    }
}
