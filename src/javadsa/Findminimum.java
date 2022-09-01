package javadsa;
public class Findminimum {
    public static void main(String[] args) {
        int[] arrar={45,63,58,52,52,63,89,25,1,36,89,74,5,6,};
        System.out.println(check(arrar));
    }
    static int check(int[] a){
        if (a.length==0){
            return -1;
        }
        int min =a[0];
        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min =a[i];
            }
        }
        return min;
    }
}
