package hackerrank.algorithms.warmup.employeesalarysort;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task2_EmployeeSalarySort {

    private static void fakeInput() {
        String args = "5\n" +
                "Pesho, 2000, Developer, DevOps, 26, pesho@gmail.com\n" +
                "Gosho, 2800, Leader, DevOps\n" +
                "Svetla, 1970.11, Manager, Sales, 31, svetla@gmail.com\n" +
                "Iva, 999, Janitor, Cleaning\n" +
                "Tina, 3333.33, Director, Sales, 42, tina@sales.my";
        System.setIn(new ByteArrayInputStream(args.getBytes()));
    }

    public static void main(String[] args) {
        fakeInput();


        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();

        String name;
        double salary;
        String position;
        String department;
        int age = 0;
        String email = "";

        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(", ");
            name = input[0];
            salary = Double.parseDouble(input[1]);
            position = input[2];
            department = input[3];

            if (input.length > 4) {
                age = Integer.parseInt(input[4]);
                email = input[5];
                employees.add(new Employee(name, salary, position, department, age, email));
            } else {
                employees.add(new Employee(name, salary, position, department));
            }
        }

//        employees.stream()
//               .sorted(Comparator.comparing(Employee::getSalary))
//               .limit(3)
//               .forEach(employee -> System.out.println(employee));

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);


        List<Employee> result = new ArrayList<>();
        while (result.size() < 3) {
            double maxSalary = 0;
            int index = -1;
            for (int j = 0; j < count; j++) {
                double currentSalary = employees.get(j).getSalary();
                if (currentSalary > maxSalary) {
                    maxSalary = currentSalary;
                    index = j;
                }
            }
            result.add(employees.get(index));
            employees.remove(index);
            count--;
        }

        for (Employee e : result) {
            System.out.println(e);
        }

    }
}
