package com.inguarus;

import java.util.Random;

public class Student extends User {

    private enum Group {
        JAVA(0),
        C(1),
        PYTHON(2),
        QA(3),
        DESIGN(4),
        FRONTEND(5);

        int value;

        Group(int value) {
            this.value = value;
        }
    }

    private Group group;
    private static Random random = new Random();

    public Student() {
        this.group = Group.values()[random.nextInt(Group.values().length)];
    }


    public int compareTo(User user) {
        int result = 0;
        if (user instanceof Student) {
            Student student = (Student) user;
            result = group.compareTo(student.group);
        }
        if (result == 0) {
            return super.compareTo(user);
        } else {
            return result;
        }

    }

    @Override
    public String toString() {
        return "Student: " +
                "group " +
                group + " - " +
                secondName + " " +
                firstName + ", " +
                age + " years old" +
                ' ';
    }
}