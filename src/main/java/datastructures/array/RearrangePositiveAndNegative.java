package datastructures.array;

import java.util.Arrays;

/**
 * @author duqian
 * @date 2020/9/1 08:34
 **/
public class RearrangePositiveAndNegative {

    public static int[] execute(int[] arr) {
        int n = arr.length, i = -1, temp;
        /**
         * 先模仿快速排序把小于0的数都放在数组的前部
         */
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int positive = i + 1, negative = 0;
        /**
         * 1.替换第一个负数和第一个正数的位置
         * 2.跳过一个负数再进行替换，以此类推。完成间隔替换，当数组为正数的时候，退出循环
         */
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
