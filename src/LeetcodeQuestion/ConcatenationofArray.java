package LeetcodeQuestion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int [] nums = {1,3,2,1};
        int[] ans = Concatenat(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] Concatenat(int[] nums) {
        int n = 0;
        int[] arr = new int[2 * nums.length];
        int i;
        for (i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        for (i = nums.length; i < 2 * nums.length; i++) {
            arr[i] = nums[n];
            n++;
        }
        return arr;
    }
}
