//https://leetcode.com/problems/reverse-bits/description/?envType=problem-list-v2&envId=bit-manipulation

public class ReverseBits {
    public static void main(String[] args) {
        int a=2147483644;
        System.out.println(reverseBits(a));	        
    }

    public static int reverseBits(int n){
        int ans=0;
        for(int i=0;i<32;i++){
            int mask=1<<i;
            if((mask&n)!=0){
                ans=ans+(1<<31-i);
            }
        }
        return ans;
    }
}
