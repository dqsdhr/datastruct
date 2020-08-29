package datastructures.array;

/**
 * @author duqian
 * @date 2020/8/28 15:02
 **/
public class FirstNonRepeatNum {

    /**
     * 数组里第一个不重复的数字
     *
     * @param arr 数组
     */
    public static Integer execute(int[] arr) {
        //边缘条件，如果数组是空，没有该数字
        if (arr == null || arr.length < 1) {
            System.out.println("Invalid param");
            return null;
        }
        int n = arr.length;
        //特殊情况，数组是一个元素，直接返回
        if (n == 1) {
            return arr[0];
        }
        /**
         * 双层循环，外层循环用于遍历数组内的所有元素
         * 内层循环用来检测数组是否有重复的
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    break;
                }
                if (j == n - 1) {
                    return arr[i];
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};
        int[] arr1 = {1};
        System.out.println(execute(arr));
    }
}
