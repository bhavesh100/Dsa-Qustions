package javadsa;

import java.util.Arrays;
import java.util.Scanner;

public class Findevennoofdigits {
    public static void main(String[] args) {
//        int [] arr = new int[5];
//        Scanner input = new Scanner(System.in);
//        for(int i=0;i< arr.length;i++){
//            arr[i] = input.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        int[] arr = {6546,564,56,564,654,65,65};
        int i = 0;
        int ans = NEven(arr);
        System.out.println(ans);
    }
    static int NEven(int[] a){
        int count=0;
        for (int i=0;i< a.length;i++){
            boolean answer = checkeven(a[i]);
            if(answer){
                count++;
            }
        }
        return count;
    }
    static boolean checkeven(int element){
        if(digit(element)%2==0){
            return true;
        }
        return false;
    }
    static int digit(int e){
        if(e==0){
            return 1;
        }
        int c = 0;
        while (e !=0) {
            e = e / 10;
            c++;
        }
        return c;
    }
}
