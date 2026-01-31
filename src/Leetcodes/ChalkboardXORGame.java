package Leetcodes;

//https://leetcode.com/problems/chalkboard-xor-game/description/
//for every odd size of array alice gets last move and loses and for every even size array bob gets 
//last move and loses

public class ChalkboardXORGame {
    public static void main(String[] args) {
        int[] a={1,1,2};
        System.out.println(xorGame(a));
    }

    public static boolean xorGame(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=count^nums[i];
        }
        if(count==0){
            return true;
        }

        if(((nums.length)%2)!=0){
            return false;
        }
        return true;
    }
}
