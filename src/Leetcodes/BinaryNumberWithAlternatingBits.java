package Leetcodes;

//https://leetcode.com/problems/binary-number-with-alternating-bits/description/?envType=daily-question&envId=2026-02-18
//Number right shifted to 1 and XOR gives all 1's 
//all 1's added to 1 and AND with 0 gives 0

public class BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(5));
    }
    public static boolean hasAlternatingBits(int n) {
        int a=n^(n>>1);
        if((a&(a+1))==0){
            return true;
        }
        return false;
    }
}
