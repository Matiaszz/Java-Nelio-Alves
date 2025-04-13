package org.codes.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quantity of workers");

        int numberOfWorkers = sc.nextInt(); sc.nextLine();


        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < numberOfWorkers; i++) {
            System.out.println("Enter the employee name");
            String name = sc.nextLine();

            System.out.println("Enter how many hours the employee had");
            Integer hours = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the value per hour");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();

            System.out.println("Is the employee outsourced? (Y)");
            String isOutsourced = sc.nextLine().toUpperCase();

            if (isOutsourced.charAt(0) == 'Y') {
                System.out.println("Type the additional charge: ");
                Double additionalCharge = sc.nextDouble();
                sc.nextLine();
                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(employee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
            System.out.println("--------------------------------");


        }
        for (Employee employee : employees){
            System.out.println(employee.getName());

            System.out.println(employee.payment());
        }

    }
}
