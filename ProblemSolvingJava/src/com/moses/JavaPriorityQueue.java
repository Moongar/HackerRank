package com.moses;

import java.util.*;
import static java.util.Collections.*;

class Student{
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}
class Priorities{
    List<Student> getStudents(List<String> events){
        List<Student> inQueue=new ArrayList<>();
        for(String e:events){
            String[] entry=e.split("\\s");
            String action =entry[0];
            if(action.equals("ENTER")){
                String name= entry[1];
                double cgpa= Double.parseDouble(entry[2]);
                int id= Integer.parseInt(entry[3]);
                inQueue.add(new Student(id,name,cgpa));
                sort(inQueue,Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId));
            } else if(action.equals("SERVED")){
                if(inQueue.size()>0) inQueue.remove(0);
            }
        }
        return inQueue;
    }
}
public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
