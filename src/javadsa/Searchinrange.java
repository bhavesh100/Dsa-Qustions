package javadsa;
public class Searchinrange {
    public static void main(String[] args) {
        int[] arrar={45,63,58,52,52,63,89,25,1,36,89,74,5,6,};
        System.out.println(check(arrar,52,5,10));

    }
    static int check(int[] a,int t,int start,int end){
        if (a.length==0){
            return -1;
        }
        for (int i=start;i<=end;i++){
            if (t==a[i]){
                return i;
            }
        }
        return -1;
    }

}
