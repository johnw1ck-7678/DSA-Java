//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
//Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

public class MaxSubArraySumK{
    public static void main(String[] args) {
        int arr[] = {100, 200, 300, 400};
        int k = 2;
        subArraySum(arr, k);
    }
    static void subArraySum(int[] arr,int k){
        int sum=0;
        int low=0;
        int high=k-1;
        for(int i=low;i<=high;i++){
            sum=sum+arr[i];
        }
        int maxSum=0;
        while(high<arr.length){
            maxSum=Math.max(maxSum, sum);
            low++;
            high++;
            if(high==arr.length){break;}
            sum=sum-arr[low-1]+arr[high];
        }
        System.out.println(maxSum);
    }

}