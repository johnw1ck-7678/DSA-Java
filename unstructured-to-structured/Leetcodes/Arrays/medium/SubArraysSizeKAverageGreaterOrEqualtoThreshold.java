//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
//Given an array of integers arr and two integers k and threshold, return the
// number of sub-arrays of size k and average greater than or equal to threshold.

import java.util.Arrays;

public class SubArraysSizeKAverageGreaterOrEqualtoThreshold {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8}; 
        int k = 3; 
        int threshold = 4;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
    static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int low=0;
        int high=k-1;
        for(int i=low;i<=high;i++){
            sum=sum+arr[i];
        }
        
        int count=0;
        while(high<arr.length){
            int avg=sum/k;
            if(avg>=threshold){
                count++;
                low++;
                high++;
                if(high==arr.length){
                    break;
                }
                sum=sum-arr[low-1]+arr[high];
            }else{
                low++;
                high++;
                if(high==arr.length){
                    break;
                }
                sum=sum-arr[low-1]+arr[high];
            }
            
        }
        return count;
    }
}
