package javadsa;

public class Smallestletter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'f';
        char ans = seelingcharacter(arr,target);
        System.out.println(ans);
    }
    static char seelingcharacter(char [] arr,char target) {
        if (target>=arr[arr.length-1]){
            return arr[0];
        }
        int start=0;
        int end= arr.length-1;
        while (arr[start]<=target){
            int mid = start + (end-start)/2;
            if (arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else {
                return arr[mid+1];
            }

        }
        return arr[start];
    }
}
