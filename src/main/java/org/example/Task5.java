package org.example;

public class Task5 {
    public static boolean leapYear(int year){
        if ((year % 4 == 0) & year % 100 != 0) {
            return true;
        } else if ((year % 4 == 0) & (year % 400 == 0) & (year % 100 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
