package javadsa;

public class Findseeling {
    public static void main(String[] args) {
        int [] arr = {-6,-1,0,1,3,6,8,9,11,14,25,30,45,26};
        int t=31,ans = seeling(arr,t);
        System.out.println(ans);

    }
    static int seeling(int [] arr,int target){
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
        return start;
    }
}
