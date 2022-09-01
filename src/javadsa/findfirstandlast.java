package javadsa;

public class findfirstandlast {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            // find the mid element
            int mid = start +(end-start)/2;
            if (nums[mid]<target) {
                start = mid +1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }else {

            }
        }

    }
    public int findlowest(int[] nums ,int mid, int target){
        while(nums[mid] == target){
            mid=mid=
        }
    }
}
