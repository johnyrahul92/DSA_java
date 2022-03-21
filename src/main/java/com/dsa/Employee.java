package com.dsa;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    


    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id=id;
        this.name=name;        
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 

    
    @Override
    public boolean equals(Object obj) {
        Employee employee=(Employee) obj;
        return this.id==employee.id;

       
    }
    
    @Override
    public int hashCode() {
        //
        return this.id;
    }

    @Override
    public String toString() {       
        return this.id+" "+ this.name;
    }

    public static void main(String[] args) {
        System.out.println("Employee");
        Employee employee1= new Employee(1, "Rahul");
        Employee employee2= new Employee(1, "Rahul");
        Employee employee3= new Employee(2, "Rahul");
        Employee employee4= new Employee(3, "Rahul");

        Set<Employee> employees= new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        System.out.println(employees);
        employees.forEach(System.out::println);
    }
    
}
