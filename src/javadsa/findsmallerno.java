package javadsa;

import java.util.Arrays;

public class findsmallerno {
    public static void main(String[] args) {
        int[] nums ={7,7,7,7};
        int[] ans = smallno(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smallno(int[] nums){
        int count;
        int[] arr = new int[nums.length];
        for (int i=0;i<arr.length;i++){
            count =0;
            for (int j=0;j<arr.length;j++){
                if (nums[i]==nums[j]){
                    continue;
                }
                if(nums[i]>=nums[j]){
                    count ++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}
