package HomeWork;

public class Task_3 {
    public static void main(String[] args) {
//        Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
        int[] arr1 = new int[]{1, 4, 7, 1, 67, 4, 3, 0,};
        int[] arr2 = new int[]{6, 7, 9, 6, 4, 0, 5, 8, 0, 0, 5, 3, 5};
        int[] arr3 = new int[]{12, 56, 89, 45, 78, 90, 69};

        System.out.println(isZero(arr2));


    }

    public static boolean isZero(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) return true;
        }
        return false;
    }

}
