package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70f;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(178);
        System.out.println("178 rubles are " + dollar + " dollar.");
    }
}

