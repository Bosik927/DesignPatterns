package com.github.bosik927.prototype.advance;

import com.github.bosik927.prototype.advance.control.Employees;

import java.util.List;

public class PrototypeDemo {

    public static void main(String... args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees newEmployees = (Employees) employees.clone();
        Employees newEmployees2 = (Employees) employees.clone();

        List<String> list = newEmployees.getEmployees();
        list.add("Cris");

        List<String> list1 = newEmployees2.getEmployees();
        list1.remove("Bob");

        System.out.println("emps List: "+employees.getEmployees());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }
}
