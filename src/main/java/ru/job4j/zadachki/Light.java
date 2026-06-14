package ru.job4j.zadachki;

public class Light {

        public static String trafficLight(String color) {
            if ("red".equals(color)) {
                return "Stop";
            }
            if ("yellow".equals(color)) {
                return "Wait";
            }
            if ("green".equals(color)) {
                return "Go";
            }
            return "Error";
        }
    }
