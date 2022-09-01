package javadsa;

import java.util.Arrays;

public class Findluckynumber {
    public static void main(String[] args) {
        int [][] matrix ={
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(Arrays.toString(luckynumber(matrix)));
    }
    static int[] luckynumber(int[][] matrix){
        int max=matrix[0][0];
        int min=matrix[0][0],no;
        int[] arrmin= new int[matrix.length];
        int[] arrmax= new int[matrix.length];
        for (int m=0;m< matrix.length;m++){
            for (int n=0;n<matrix[m].length;n++){
                if(matrix[m][n]<min){
                    min=matrix[m][n];

                }
                arrmin[m]=min;

            }
        }

        for (int m=0;m< matrix.length;m++){
            for (int n=0;n<matrix[m].length;n++){
                if(matrix[m][n]<min){
                    min=matrix[n][m];
                    arrmax[m]=max;
                }
            }
        }
        return arrmin;
    }
}
