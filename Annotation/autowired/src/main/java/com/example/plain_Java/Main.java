package com.example.plain_Java;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Person person = new Person();

        person.setParrot(parrot);
        System.out.println(parrot.getName());
        System.out.println(person.getParrot().getName());
    }
}