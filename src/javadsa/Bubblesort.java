package javadsa;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int [] arr = {5,23,2,0,89,63,56,56};
        System.out.println(Arrays.toString(Sorting(arr)));
    }
    public static int[] Sorting(int[] arr){
        int temp;
        boolean swapped;
        for (int i=0;i< arr.length;i++){
            swapped = false;
            for (int j=1;j< arr.length-i;j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        return arr;
    }
}
