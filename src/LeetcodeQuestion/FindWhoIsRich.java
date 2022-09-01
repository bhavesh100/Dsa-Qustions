package LeetcodeQuestion;

public class FindWhoIsRich {
    public static void main(String[] args) {
        int[][] acounts = {
                {1,2,3},
                {3,2,1}
        };
        int ans = maxwealth(acounts);
        System.out.println(ans);
    }
    static int maxwealth(int[][] acounts){
        int max=0;
        for (int i=0;i< acounts.length;i++){
            int n = 0;
            for (int j=0;j<acounts[i].length;j++){
                 n = n +acounts[i][j];
            }
            if(n>max){
                max=n;
            }
        }
        return max;
    }
}
