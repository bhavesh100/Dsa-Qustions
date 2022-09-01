package javadsa;

import java.util.Arrays;

public class Findtwosum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    static int[] twoSum(int[] nums, int target){
        int[] arr = new int[2];
        for (int i=0;i< nums.length;i++){
            for (int j=0;j< nums.length;j++){
                if (i!=j){
                    if (nums[i]+nums[j]==target){
                        arr[0] = j;
                        arr[1] = i;
                    }
                }
            }
        }

        return arr;

    }
}
