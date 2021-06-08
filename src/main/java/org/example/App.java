package org.example;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class App {
    public static void main(String[] args) {
        //////////////Task 1//////////////////////
        String arr[] = {"kek", "lol", "foo", "bar", "aza"};
        Integer arr2[] = {1, 2, 3, 4, 5, 6};
        Float arr3[] = {1.5f, 3.78f, 5.32f, 77.6f, 12f, 17f};
        Swap.swapElements(arr, 0, 3);
        Swap.swapElements(arr2, 1, 3);
        Swap.swapElements(arr3, 5, 2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        //////////////////////////////////////////

        //////////////Task 2//////////////////////
        Box<Orange> boxOfOranges = new Box(1);
        Box<Orange> boxOfOranges2 = new Box(2);
        Box<Apple> boxOfApples = new Box(3);
        Box<Apple> boxOfApples2 = new Box(4);
        for (int i = 0; i < 40; i++) {
            boxOfOranges.addFruit(new Orange());
        }
        for (int i = 0; i < 60; i++) {
            boxOfOranges2.addFruit(new Orange());
        }

        for (int i = 0; i < 100; i++) {
            boxOfApples.addFruit(new Apple());
        }
        for (int i = 0; i < 50; i++) {
            boxOfApples2.addFruit(new Apple());
        }
        boxOfOranges.getBoxInfo();
        boxOfOranges2.getBoxInfo();
        boxOfApples.getBoxInfo();
        boxOfApples2.getBoxInfo();

        boxOfOranges.moveFruitsFrom(boxOfOranges2);
        boxOfApples.moveFruitsFrom(boxOfApples2);
        System.out.println("Коробки после перемещения фруктов: ");
        boxOfOranges.getBoxInfo();
        boxOfOranges2.getBoxInfo();
        boxOfApples.getBoxInfo();
        boxOfApples2.getBoxInfo();
        System.out.println("Сравнение веса коробок: ");
        System.out.println(boxOfApples.compareBoxes(boxOfOranges));
        System.out.println(boxOfApples2.compareBoxes(boxOfOranges2));
        System.out.println(boxOfApples.compareBoxes(boxOfOranges2));
    }
}
