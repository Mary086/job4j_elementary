package ru.job4j.Calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short heights) {
        double rsl = (heights - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        short heights = 160;
        double woman = Fit.womanWeight(heights);
        System.out.println("Woman 160 is " + woman);
    }
}
