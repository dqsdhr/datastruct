package datastructures.array;

import lombok.*;

import java.util.Arrays;

/**
 * @author duqian
 */
@Data
@Builder
public class MergeTwoSorted {

    public static int[] execute(int[] arr1, int[] arr2) {
        //边缘条件
        if (arr1 == null || arr1.length == 0) {
            return arr2;
        }
        if (arr2 == null || arr2.length == 0) {
            return arr1;
        }

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        //遍历arr1和arr2，按从小到大的顺序把数组中的元素放入result
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            }else {
                result[k++] = arr2[j++];
            }
        }
        //把剩余的元素放入result
        //如果arr1有剩余元素
        while (i < n1) {
            result[k++] = arr1[i++];
        }
        //如果arr2有剩余元素
        while (j < n2) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;

        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;

        System.out.println(Arrays.toString(execute(arr1, arr2)));
    }
}
