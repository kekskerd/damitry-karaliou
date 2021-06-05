package org.example;

public class Task10 {
    public static boolean halfArr(int[] arr){
       int arrSum = 0;
       int arrHalfSum = 0;
       for(int i = 0; i < arr.length; i++){
           arrSum += arr[i];
       }
       for(int i = 0; i < arr.length; i++){
           if (arrHalfSum == arrSum - arrHalfSum){
               return true;
           }
           arrHalfSum += arr[i];
       }
       return false;
    }
}
