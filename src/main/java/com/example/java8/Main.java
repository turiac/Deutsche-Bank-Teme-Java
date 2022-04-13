package com.example.java8;

import com.example.java8.model.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("CREATED USERS");
        Stream<User> stream = Stream.generate(() -> User.createUser()).limit(3); //Stream with 3 users
        ArrayList<User> users = new ArrayList<>();
        users.add(User.createUser());
        users.add(User.createUser());
        users.add(User.createUser());
        System.out.println(users);

        System.out.println("\nFILTER WITH AGE < 18");
        System.out.println(users.stream() //Filter users with age < 18
                .filter(user -> user.getAge() < 18)
                .collect(Collectors.toList()));

        System.out.println("\nFILTER WITH AGE < 18 * 2");
        System.out.println(users.stream() //Filter users with age < 18 and doubles it
                .filter(user -> user.getAge() < 18)
                .map(user -> {user.setAge(user.getAge()*2); return user;})
                .collect(Collectors.toList()));

        System.out.println("\nFILTER PRINT THE LAST ELEMENT OF THE STREAM");
        System.out.println(users.stream() //Print the last element of the stream
                .filter(user -> user.getAge() < 18)
                .map(user -> {user.setAge(user.getAge()*2); return user;})
                .reduce((first, second) -> second)
                .orElse(null));


        System.out.println("\nFILTER USER WITH SMALLEST AGE");
        System.out.println(users.stream() //User with the smallest age
                .min(Comparator.comparingInt(User::getAge)).get());


        System.out.println("\nFILTER USER WITH GREATEST AGE");
        System.out.println(users.stream() //User with the greatest age
                .max(Comparator.comparingInt(User::getAge)).get());


        System.out.println("\nUSERS THAT ARE NOT DUPLICATES");
        System.out.println(users.stream() //Remove duplicates from the list
                .distinct()
                .collect(Collectors.toList()));


        System.out.println("\nFILTER USER WITH 30 > AGE, UPPERCASE & DESC AGE");
        System.out.println(users.stream()
                .filter(user -> user.getAge() > 30)
                .map(user -> {user.setName(user.getName().toUpperCase(Locale.ROOT)); return user;})
                .sorted(User::compareAgeDesc)
                .collect(Collectors.toList()));
        }
    }
