package dev.ak.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

    public static void main(String[] args) {

        Map<Employee, String> employees = new HashMap<>();
        Employee employee = new Employee(1, "Ajith", 27);
        System.out.println("hashcode of employee1: " + employee.hashCode());
        Employee employee2 = new Employee(1, "Ajith", 27);
        System.out.println("hashcode of employee2: " + employee2.hashCode());

        employees.put(employee,"Developer");

        System.out.println(employees.get(employee2));

    }


}
