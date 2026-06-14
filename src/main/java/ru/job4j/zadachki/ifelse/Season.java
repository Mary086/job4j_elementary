package ru.job4j.zadachki.ifelse;

public class Season {
    public static String getSeason(int month){
        if (month == 12 || month == 1 || month == 2) {
            return "Winter";
        }
        if (month == 3 || month == 4 || month == 5) {
            return "Spring";
        }
        if (month == 6 || month == 7 || month == 8) {
            return "Summer";
        }
        if (month == 9 || month == 10 || month == 11) {
            return "Autumn";
        }
return "Invalid month";
    }
}

