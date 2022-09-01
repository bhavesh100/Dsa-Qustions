package LeetcodeQuestion;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {3,2,1,2,4};
        boolean ans = check(arr);
        System.out.println(ans);
    }
    static boolean check(int[] arr){
        for(int i=0;i<arr.length;i=i+arr[i]){
            if(i== arr.length-1){
                return true;
            }
            if(arr[i]==0){
                return false;
            }
        }
        return false;
    }
}
