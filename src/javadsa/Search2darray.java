package javadsa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Search2darray {
    public static void main(String[] args) {
        int[][] arr = {
            {4,5,6,2,5,2,5},
            {6,2,5,8,6,3,5},
                {5,8,9,8}
        };
        int[] ans = search(arr,5);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] a, int t){
        for (int i=0;i< a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(t==a[i][j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int []{-1};
    }
}
