package com.edwardoboh;

import java.util.ArrayList;
import java.util.List;
import static com.edwardoboh.Main.Gender.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("edward", MALE),
                new Person("jane", FEMALE),
                new Person("john", MALE)
        );

        List<Person> males = new ArrayList<>();

        for (Person male: people) {
            if(male.gender.equals(MALE)){
                males.add(male);
            }
        }

        for (Person male: males){
            System.out.println(male);
        }
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE;
    }
}
