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

        System.out.println("----------task 6----------");
        int[] arr = {1,0,0,1,1,1,0,0,0};
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
