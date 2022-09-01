package javadsa;

import java.util.Arrays;

public class Arraybuffer {
    public static void main(String[] args) {
        int[] nums ={2,5,1,3,4};
        int n=3;
        int [] ans= Aftershuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Aftershuffle(int[] nums,int n){
        int i,j=0,k=n;
        int[] arr= new int[nums.length];
        for(i=0;i<n;i=i+2){
            arr[i]=nums[j];
            j++;
        }
        for (i=0;i< nums.length;i=i+2){
            arr[i]=nums[k];
            k++;
        }
        return arr;
    }
}
