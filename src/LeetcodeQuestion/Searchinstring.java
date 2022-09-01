package LeetcodeQuestion;
public class Searchinstring {
    public static void main(String[] args) {
      String s = "My name is bhavesh";
        System.out.println(linearsearch(s, 'h'));
    }
    static int linearsearch(String a,char t){
        for(int i=0; i< a.length();i++){
            if(t==a.charAt(i)){
                return (int)i;
            }
        }
        return 0;
    }
}
