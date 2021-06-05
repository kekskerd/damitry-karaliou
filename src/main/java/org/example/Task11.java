package org.example;

public class Task11 {
    public static int[] shiftArr(int arr[], int n) {
        if (n >= 0){
            for (int i = 0; i < n; i++) {
                int buff = arr[0];
                arr[0] = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[1] = buff;
            }
            return arr;
        }
        else {
            for (int i = 0; i > n; i--) {
                int buff = arr[arr.length - 1];
                arr[arr.length - 1] = arr[0];
                for (int j = 1; j < arr.length - 1; j++) {
                    arr[j - 1] = arr[j];
                }
                arr[arr.length - 2] = buff;
            }
            return arr;
        }
    }
}
