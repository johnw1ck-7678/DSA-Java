package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(revno(56987));
    }
    public static int revno(int n){
        if(n==0){
            return 0;
        }
       int x=digits(n);
       return ((int)((n%10)*Math.pow(10,x))) + revno(n/10);
    }
    public static int digits(int a){
        int count=-1;
        while(a>0){
            a=a/10;
            count++;
        }
        return count;
    }
}
