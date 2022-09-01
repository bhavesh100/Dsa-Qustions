package LeetcodeQuestion;

import java.util.Arrays;

public class Matrixtranspose {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        int [][] ans = transpose(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }

    }
    static public int[][] transpose(int[][] matrix) {
        int row = matrix[0].length;
        int column = matrix.length;;
            int [][] arr = new int[row][column];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    arr[j][i] = matrix[i][j];
                }
            }
            return arr;
        }
    }

