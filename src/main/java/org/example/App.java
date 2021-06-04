package org.example;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------task 1-----------");
        printThreeWords();
        System.out.println("----------task 2-----------");
        checkSumSign();
        System.out.println("----------task 3-----------");
        printColor();
        System.out.println("----------task 4-----------");
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange \nBanana \nApple");
    }

    public static void checkSumSign(){
        int a, b;
        a = 12;
        b = 7;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(){
        int value = 100;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if(value <= 100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a, b;
        a = 5;
        b = 2;
        if(a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }


}
