package com.moses;

import java.util.*;

public class JimOrder {
    public static void main(String[] args) {
        //int[][] orders={{8,1},{4,2},{5,6},{3,1},{4,3}};
        int[][] orders={{3,3},{1,2},{2,1},{1,5},{5,1},{4,1},{1,4},{2,3},{3,2}};
        for(int i:jimOrders(orders)){
            System.out.println(i);
        }
    }
    static int[] jimOrders(int[][] orders) {
        int n=orders.length;
        int[] servedFirst= new int[n];
        List<Student> students=new ArrayList<>();
        for(int i=0;i<n;i++){
            students.add(new Student(i+1, orders[i][0],orders[i][1]));
        }
        Collections.sort(students,Comparator.comparing(Student :: getServingTime).thenComparing(Student::getNumber));
        for(int i=0;i<n;i++){
            servedFirst[i]=students.get(i).getNumber();
        }
        return servedFirst;
    }
    static class Student{
        int number;
        int orderNumber;
        int orderTime;
        int ServingTime;

        public Student(int number, int orderNumber, int orderTime) {
            this.number = number;
            this.orderNumber = orderNumber;
            this.orderTime = orderTime;
            this.ServingTime=orderNumber+orderTime;
        }

        public int getNumber() {
            return number;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public int getServingTime() {
            return ServingTime;
        }
    }
}
