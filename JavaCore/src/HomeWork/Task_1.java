package HomeWork;

import java.util.Arrays;

public class Task_1{
    public static void main(String[] args) {
//        Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
        int[] arr1 = new int[]{1,4,7,1,67,4,3,1,7,};
        int[] arr2 = new int[]{6,7,9,6,4,2,5,8,5,7,5,3,5};
        int[] arr3 = new int[]{12,56,89,45,78,90,69};
        System.out.println(diff(arr3));

    }
    public static int diff(int []arr){
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }
}
