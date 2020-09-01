package datastructures.array;

import java.util.Arrays;

/**
 * @author duqian
 * @date 2020/9/1 08:34
 **/
public class RearrangePositiveAndNegative {

    public static int[] execute(int[] arr) {
        int n = arr.length, i = -1, temp;
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int positive = i + 1, negative = 0;
        while (positive < n && negative < n && arr[negative] < 0) {
            temp = arr[negative];
            arr[negative] = arr[positive];
            arr[positive] = temp;
            positive++;
            negative += 2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        System.out.println(Arrays.toString(execute(arr)));
    }
}
