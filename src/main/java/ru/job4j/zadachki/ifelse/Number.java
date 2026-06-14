package ru.job4j.zadachki.ifelse;

public class Number {
    public static String checkNumber(int num) {
        if (num > 0) {
            return "Positive";
        }
        if (num < 0) {
            return "Negative";

        }
        return "Zero";
    }
}

