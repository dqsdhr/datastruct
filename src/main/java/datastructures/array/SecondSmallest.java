package datastructures.array;

/**
 * @author duqian
 * @date 2020/8/27 15:44
 **/
public class SecondSmallest {


    public static void execute(int[] arr) {
        //边缘条件1数组至少有两个元素
        if (arr.length < 2) {
            System.out.println("Invalid Input");
        }
        int first, second, size;
        first = second = Integer.MAX_VALUE;
        size = arr.length;
        //遍历数组
        for (int i = 0; i < size; i++) {
            //1.如果当前元素小于first，更新first和second
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            }
            //2.(进入分支的数字已经是大于或等于first的)如果当前元素不等于first或者大于first，小于second，更新second
            else if (first < arr[i] && arr[i] < second) {
                second = arr[i];
            }
        }
        //边缘条件，如果second等于初始值MAX_VALUE,则数组没有第二小的数字
        if (second == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest number!");
        } else {
            System.out.println(String.format("First smallest number is %d, Second smaller number is %d", first, second));
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        execute(arr);
    }
}
