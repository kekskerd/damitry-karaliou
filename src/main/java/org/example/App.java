package org.example;

public class App {
    public static void main( String[] args ) {

        System.out.println("----------task 1----------");
        boolean result1 = Task1.compareNumbers(13, 3);
        System.out.println(result1);

        System.out.println("----------task 2----------");
        Task2.posNumber(-6);

        System.out.println("----------task 3----------");
        boolean result3 =Task3.posNumberReturn(9);
        System.out.println(result3);

        System.out.println("----------task 4----------");
        Task4.writeStringNTimes("test string", 5);

        System.out.println("----------task 5----------");
        boolean result5 = Task5.leapYear(1500);
        System.out.println(result5);
    }
}
