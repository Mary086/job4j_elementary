package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
    public class MathCalculator {

        public static double sumAndMultiply(double first, double second) {
            return sum(first, second)
                    + multiply(first, second);
        }

        public static double divideAndSubtract(double first, double second) {
            return divide(first, second)
                    + subtract(first, second);
        }

        public static double all(double first, double second) {
            return divide(first, second)
                    + subtract(first, second)
                    + sum(first, second)
                    + multiply(first, second);
        }

        public static void main(String[] args) {
            System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
            System.out.println("Результат расчета равен: " + divideAndSubtract(10, 20));
            System.out.println("Результат расчета равен: " + all(10, 20));
        }
    }