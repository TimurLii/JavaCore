import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 2, 5, 7, 0, 9, 7, 5, 4, 32, 5, 6, 8, 0, 7, 6, 5, 4, 3, 5, 67, 0, 5, 4, 23, 1, 3, 54, 6, 78, 90, 6, 5, 4, 1, 2, 4, 5, 6, 6};
        int k = 7;
        int index = 3;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] addNum(int[] num, int k) {
        int newNums[] = new int[num.length + 1];
        for (int i = 0; i < num.length; i++) newNums[i] = num[i];
        newNums[newNums.length - 1] = k;
        return newNums;
    }

    public static int[] sort(int[] arr) {
        int[] newNums = new int[arr.length ];
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int index = 0;
        int count = 1;
            while (index <= newNums.length - 1) {
                for (var item : map.entrySet()) {
                while(count <= item.getValue()) {
                    newNums[index] = item.getKey();
                    index++;
                    count++;
                }
                count =1;
            }
        }
        return newNums;
    }
}