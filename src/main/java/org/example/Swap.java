package org.example;

public class Swap {
    public static <T> void swapElements(T[] arr, int index1, int index2){
        T mid = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = mid;
    }
}
