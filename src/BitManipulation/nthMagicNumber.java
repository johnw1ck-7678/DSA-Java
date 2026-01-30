package BitManipulation;

public class nthMagicNumber{
    public static void main(String[] args) {
        
        System.out.println(magicNumber(2));
    }

    public static int magicNumber(int n){
        int count=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            count=count+last*base;
            base=base*5;
        }
        return count;
    }
}