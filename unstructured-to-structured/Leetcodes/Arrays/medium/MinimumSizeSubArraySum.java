//https://leetcode.com/problems/minimum-size-subarray-sum/description/

//Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose 
// sum is greater than or equal to target. If there is no such subarray, return 0 instead.
public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int target = 7; 
        int[]nums = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target, nums));
    }
    static int minSubArrayLen(int target, int[] nums){
        int low=0;
        int high=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        while(high<nums.length){
            sum=sum+nums[high];
            while(sum>=target){
                int len=high-low+1;
                res=Math.min(len,res);
                sum=sum-nums[low];
                low++;
            }
            high++;
        }
        if(res==Integer.MAX_VALUE){return 0;}
        return res;
    }
}
