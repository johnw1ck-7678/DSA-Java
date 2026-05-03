public class Fibonnaci {
    public static void main(String[] args) {
        System.out.println(nFibonaachi(6));
    }
    public static int nFibonaachi(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return nFibonaachi(n-1)+nFibonaachi(n-2);
        
    }
}
