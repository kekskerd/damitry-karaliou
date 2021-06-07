package org.example;

public class App {
    public static void main(String[] args) throws MyArraySizeException {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3","4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] unCorrectArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3","4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3"}
        };
        String[][] unCorrectArray2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3","4"},
                {"1", "lalala", "3", "4"},
                {"1", "2", "3", "4"}
        };
        int result = sumOfArray(correctArray);
        System.out.println("Сумма элементов массива: " + result);
        int result2 = sumOfArray(unCorrectArray);
        System.out.println("Сумма элементов массива: " + result2);

    }

    public static int sumOfArray(String[][] arr) throws MyArraySizeException , MyArrayDataException{
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4){
                    throw new MyArraySizeException("Неправильный размер массива");
                }
                try{
                    sum += Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e){
                    throw new MyArrayDataException(e.getMessage() + " На позиции " + i + "-"+ j);

                }

            }
        }
        return sum;
    }

}
