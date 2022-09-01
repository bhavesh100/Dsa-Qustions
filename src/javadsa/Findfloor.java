package javadsa;

public class Findfloor {
    public static void main(String[] args) {
        int [] arr = {-6,-1,0,1,3,6,8,9,11,14,25,30,45,26};
        int t=-79,ans = floor(arr,t);
        System.out.println(ans);

    }
    static int floor(int [] arr,int target){
        if (target<arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                start = mid+1;
            } else if (arr[mid] > target) {
                end = mid -1;
            }
        }
        return end;
    }
}
