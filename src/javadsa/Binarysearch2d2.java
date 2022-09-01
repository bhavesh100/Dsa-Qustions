package javadsa;

import java.util.Arrays;

public class Binarysearch2d2 {
    public static void main(String[] args) {
        int[][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(matrix,5)));
    }
    static int[] Binarysearch(int[][] matrix, int row, int cstart, int cend , int target){
        while (cstart <= cend){
            int mid = cstart + (cend - cstart);
            if (matrix[row][mid]==target){
                return new int[] {row,mid};
            } else if (matrix[row][mid] < target) {
                cend = mid -1;
            } else {
                cstart = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int colums = matrix[0].length;
        if (rows == 1){
            return Binarysearch(matrix,0, 0, colums-1, target);
        }
        //run the loops till two colums are remaining
        int rstart = 0;
        int rend = rows-1;
        int cmid = colums/2;
        while (rstart <= rend){
            int mid = rstart + (rend-rstart)/2;
            if (matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if (matrix[mid][cmid]<target){
                rstart = mid;
            } else {
                rend = mid;
            }
        }
        // two rows are remaining
        if (matrix[rstart][cmid] == target){
            return new int[] {rstart,cmid};
        }
        if (matrix[rstart+1][cmid]==target) {
            return new int[] {rstart+1,cmid};
        }
        if (matrix[rstart][cmid]>target){
            return  Binarysearch(matrix,rstart,0,cmid-1,target);
        }
        if (matrix[rstart][cmid]<target){
            return  Binarysearch(matrix,rstart,0,cmid+1,target);
        }
        if (matrix[rstart+1][cmid]>target){
            return  Binarysearch(matrix,rstart+1,0,cmid-1,target);
        }
        if (matrix[rstart+1][cmid]<target){
            return  Binarysearch(matrix,rstart+1,0,cmid+1,target);
        }
        return new int[] {-1,-1};
    }
}
