package com.example.java8.model;

import lombok.Data;

import java.util.Random;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private static Integer incrementId = 0;

    public static User createUser() { //method createUser with incremental id, random name & age
        User user = new User();
        user.setId(incrementId++);
        Random random = new Random();
        String[] names = {"Alex", "Marcel", "Costin", "Andreea", "Filip", "Bogdan"};
        user.setName(names[random.nextInt(names.length)]);
        user.setAge(random.nextInt(100));
        return user;
    }

    public int compareAge(User u) {
        return this.age.compareTo(u.age);
    }

    public int compareAgeDesc(User u) {
        return - this.age.compareTo(u.age);
    }
}
