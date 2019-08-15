package com.github.bosik927.composite.java8;

import com.github.bosik927.composite.java8.departments.Department;
import com.github.bosik927.composite.java8.departments.FinancialDepartment;
import com.github.bosik927.composite.java8.departments.HeadDepartment;
import com.github.bosik927.composite.java8.departments.SalesDepartment;

public class CompositeDemo {

    public static void main(String... args) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}
