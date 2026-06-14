package ru.job4j.zadachki.ifelse;


public class HelloWorld {
    public static String checkNumber(int number) {
        boolean a = number % 3 == 0;
        boolean b = number % 5 == 0;

        if (a && b) {
            return "Hello, World!!!";
        }
        if (a) {
            return "Hello";
        }
        if (b) {
            return "World";
        }
        return "Operation not support";
    }
}