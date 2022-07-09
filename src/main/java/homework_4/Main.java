package homework_4;


public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.initEmployee().forEach(System.out::println);
    }
}

