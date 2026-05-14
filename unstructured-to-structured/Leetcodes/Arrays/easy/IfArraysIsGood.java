//https://leetcode.com/problems/check-if-array-is-good/?envType=daily-question&envId=2026-05-14

import java.util.Arrays;

public class IfArraysIsGood {
    public static void main(String[] args) {
        int[] arr={1,3,3,2}; 
        System.out.println(isGood(arr));
    }
    static boolean isGood(int[] nums){

        Arrays.sort(nums);
        int c=nums.length-1;
        for(int i=0;i<c;i++){
            if(nums[i]!=i+1){
                return false;
            }

        }
        return nums[c]==c;

    }
}
