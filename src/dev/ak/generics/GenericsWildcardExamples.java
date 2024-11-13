package dev.ak.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcardExamples {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        List<Accountant> accountants = new ArrayList<>();
        accountants.add(new Accountant());

        processAny(employees);
        processAny(accountants);

        processSubClass(employees);
        processSubClass(accountants);

        processSuperClass(employees);
        //processSuperClass(accountants);

    }

    public static void processAny(List<?> elements) {
        Object o = elements.get(0);
    }

    public static void processSubClass(List<? extends Employee> employees) {
        for (Employee employee: employees) {
            employee.work();
        }
    }

    public static void processSuperClass(List<? super Employee> employees) {
        Object o = employees.getFirst();
    }
}

class Employee {

    public void work() {
        System.out.println("Employee working");
    }
}

class Accountant extends Employee {

    @Override
    public void work() {
        System.out.println("Accountant working");
    }
}
