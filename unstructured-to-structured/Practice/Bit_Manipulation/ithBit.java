public class ithBit {
    public static void main(String[] args) {
        System.out.println(getBit(4,7));
    }
    public static int getBit(int n,int target){
        int i=n&1<<(target-1);
        if(i==0){
            return 0;
        }
        return 1;
    }
}
