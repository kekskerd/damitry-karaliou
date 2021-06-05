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
        System.out.println();

        System.out.println("----------task 7----------");
        int task7Arr[] = new int[100];
        for (int i = 0; i < task7Arr.length; i++){
            task7Arr[i] = i + 1;
        }
        for (int i = 0; i < task7Arr.length; i++) {
            System.out.print(task7Arr[i] + " ");
        }
        System.out.println();

        System.out.println("----------task 8----------");
        int task8Arr[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < task8Arr.length; i++){
            if (task8Arr[i] < 6){
                task8Arr[i] = task8Arr[i] * 2;
            }
        }
        for (int i = 0; i < task8Arr.length; i++) {
            System.out.print(task8Arr[i] + " ");
        }
        System.out.println();

        System.out.println("----------task 8.1----------");
        int task81Arr[][] = {{0,0,0,0},
                             {0,0,0,0},
                             {0,0,0,0},
                             {0,0,0,0}};
        for (int i = 0; i < task81Arr.length; i++){
            for (int j = 0; j < task8Arr.length; j++){
                if(i == j){
                    task81Arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < task81Arr.length; i++){
            for (int j = 0; j < task81Arr[i].length; j++){
                System.out.print(task81Arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------task 9----------");
        int task9arr[] = Task9.lenInitialvalueArr(7, 12);
        for (int i = 0; i < task9arr.length; i++) {
            System.out.print(task9arr[i] + " ");
        }
        System.out.println();

        System.out.println("----------task 9.1----------");
        int task91Arr[] = { 5, 7, -6, 99, 34, -4, 0, 105, 3, 2, 1 };
        int min = 0;
        int max = 0;
        for (int i = 0; i < task91Arr.length; i++){
            if (min > task91Arr[i]){
                min = task91Arr[i];
            }
            if (max < task91Arr[i]){
                max = task91Arr[i];
            }
        }
        System.out.println("Min: " + min + " " + "Max: " + max);

        System.out.println("----------task 10----------");
        int task10Arr[] = { 2, 2, 2, 1, 2, 2, 10, 1 };
       boolean result10 = Task10.halfArr(task10Arr);
        System.out.println(result10);


    }
}
