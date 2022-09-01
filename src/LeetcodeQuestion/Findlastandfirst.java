package LeetcodeQuestion;

import java.util.Arrays;

public class Findlastandfirst {
    public static void main(String[] args) {
        int [] arr = {5,4,8,8,8};
        int t = 8;
        int [] ans = searchRange(arr,t);
        System.out.println(Arrays.toString(ans));
    }
    static public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};

        arr[0] = search(nums, target, true);
        arr[1] = search(nums,target, false);

        return arr;

    }
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans =-1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }else {
                //  potential answer found
                ans = mid;
                if (findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
