package org.example;

import java.util.Arrays;

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
    }

}
