package com.github.bosik927.prototype.advance;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> employees;

    public Employees(){
        employees = new ArrayList<>();
    }

    public Employees(List<String> list){
        this.employees =list;
    }

    public void loadData(){
        employees.add("Bob");
        employees.add("Tom");
        employees.add("David");
        employees.add("Mark");
    }

    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> cloning = new ArrayList<>(this.getEmployees());
        return new Employees(cloning);
    }

}