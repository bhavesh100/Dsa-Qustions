package javadsa;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {-6,-1,0,1,3,6,8,9,11,14,25,30,45,26};
        int t=6,ans = bs(arr,t);
        System.out.println(ans);

    }
    static int bs(int [] arr, int t){
        int start =0,end =arr.length-1;
        while (start<=end){
            // find the mid element
            int mid = start +(end-start)/2;
            if (arr[mid]<t) {
                start = mid +1;
            }
            else if (arr[mid] > t) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
