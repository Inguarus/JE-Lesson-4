package com.inguarus;

import java.util.Random;

public class User implements Comparable<User> {

    protected FirstName firstName;
    protected SecondName secondName;
    protected int age;


    private static Random random = new Random();


    public User() {
        this.firstName = firstName.values()[random.nextInt(FirstName.values().length)];
        this.secondName = secondName.values()[random.nextInt(SecondName.values().length)];
        this.age = random.nextInt(15) + 30;
    }

    @Override
    public int compareTo(User user) {
        int result = Integer.compare(secondName.value, user.secondName.value);
        if (result == 0) {
            result = Integer.compare(firstName.value, user.firstName.value);
        }
        if (result == 0) {
            result = Integer.compare(age, user.age);
        }
        return result;
    }


    @Override
    public String toString() {
        return "User: " +
                secondName + " " +
                firstName + ", " +
                age + " years old" +
                ' ';
    }
}
