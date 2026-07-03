class Employee {
    
    int employeeId;
    String name;
    double salary;

    // Static variable
    static int employeeCount = 0;

    
    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        employeeCount++;   
    }

    
    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice", 50000.0);
        Employee emp2 = new Employee(102, "Bob", 60000.0);
        Employee emp3 = new Employee(103, "Charlie", 55000.0);

        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();

        Employee.displayEmployeeCount();
    }
}