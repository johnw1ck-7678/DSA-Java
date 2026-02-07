package Leetcodes;

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(A)));
    }
    public static int[] runningSum(int[] nums){

        int[] arr=new int[nums.length];
        int a=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=a+nums[i];
            a=arr[i];
        }
        return arr;

    }
}
