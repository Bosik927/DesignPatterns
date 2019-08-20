package com.github.bosik927;

import com.github.bosik927.prototype.advance.Employees;

import java.util.List;

public class CreationPatternsDemo {

    public static void main(String... args) throws CloneNotSupportedException {
        /*SAMPLE PROTOTYPE*/

        /*ADVANCE PROTOTYPE*/
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
