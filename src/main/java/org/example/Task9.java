package org.example;

public class Task9 {
    public static int[] lenInitialvalueArr(int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
