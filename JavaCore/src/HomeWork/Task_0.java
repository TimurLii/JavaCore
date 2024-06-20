package HomeWork;

import java.util.Arrays;

public class Task_0 {
    public static void main(String[] args) {
//        Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
//        countEvens([2, 2, 0]) → 3 countEvens([2, 2, 0]]) → 0    }
        int[] arr1 = new int[]{2, 1, 2, 3, 4};
        int[] arr2 = new int[]{2, 2, 0};
        int[] arr3 = new int[]{2, 2, 0};
        System.out.println(evenNumber(arr1));
    }

    public static int evenNumber(int[] arr){
        int count =0;
        for(int i =0; i< arr.length; i++){
            if(arr[i] %2 ==0){
                count++;
            }
        }

        return count;
    }
}
