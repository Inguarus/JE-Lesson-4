package com.inguarus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        int size = 100;
        while (users.size() < size) {
            User user = new User();
            if (!users.contains(user)) {
                users.add(user);
            }
        }

        System.out.println("List of 100 non-repeating `User`:");
        System.out.println(" ");
        users.forEach(System.out::println);
        Collections.sort(users);
        System.out.println("====================================");
        System.out.println(" ");
        System.out.println("Sorted list `User`:");
        System.out.println(" ");
        users.forEach(System.out::println);
        System.out.println(" ");

        List<Student> students = new ArrayList<>();
        while (students.size() < size) {
            Student student = new Student();
            if (!students.contains(student)) {
                students.add(student);
            }
        }

        System.out.println("List of 100 non-repeating `Student`:");
        System.out.println(" ");
        users.forEach(System.out::println);
        Collections.sort(students);
        System.out.println("====================================");
        System.out.println(" ");
        System.out.println("Sorted list `Student`:");
        System.out.println(" ");
        users.forEach(System.out::println);

    }
}
