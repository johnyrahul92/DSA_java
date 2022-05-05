package com.dsa.heap;



import java.util.PriorityQueue;

public class TestPQ {

    public static void main(String[] args) {
        

        PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();

        Employee employee1=new Employee(1, "Rahul");
        Employee employee2=new Employee(2, "Kodi");
        Employee employee3=new Employee(3, "Anitha");
        Employee employee4=new Employee(3, "Nora");

        priorityQueue.add(employee1);
        priorityQueue.add(employee2);
        priorityQueue.add(employee3);
        priorityQueue.add(employee4);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
    }
    
}
