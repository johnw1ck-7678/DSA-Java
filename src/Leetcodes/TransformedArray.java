package Leetcodes;

import java.util.Arrays;

//https://leetcode.com/problems/transformed-array/?envType=daily-question&envId=2026-02-05
public class TransformedArray {
    public static void main(String[] args) {
        int[] a={3,-2,1,1};
        System.out.println(Arrays.toString(constructTransformedArray(a)));
    }
    public static int[] constructTransformedArray(int[] nums){
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr[i]=0;
            }else{
                int k=nums[i];
                int index=(i+k)%n;
                if(index<0){
                    index=index+n;
                }
                arr[i]=nums[index];
            }
        }
        return arr;
    }
}
