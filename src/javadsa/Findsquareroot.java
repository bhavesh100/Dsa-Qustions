package javadsa;

public class Findsquareroot {
    public static void main(String[] args) {
        System.out.println(squareroot(8));

    }
    static int squareroot(int n){
        for(int i=0;i<n;i++){
            if(i*i==n||i*i<n){
                return i;
            }
        }
        return-1;
    }
}
