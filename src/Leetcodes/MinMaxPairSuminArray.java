package Leetcodes;

import java.util.Arrays;

//https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/?envType=daily-question&envId=2026-01-24
public class MinMaxPairSuminArray{
    public static void main(String[] args) {
        int[] A={3,5,2,3};
        System.out.println(minPairSum(A));
    }
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(maxSum<sum){maxSum=sum;}
            i++;
            j--;
        }
        return maxSum;

    }
}