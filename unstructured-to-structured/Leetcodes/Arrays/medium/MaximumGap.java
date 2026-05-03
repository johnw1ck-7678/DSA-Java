//https://leetcode.com/problems/maximum-gap/?envType=problem-list-v2&envId=radix-sort

public class MaximumGap {
    public static void main(String[] args) {
        int[] A={3,6,9,1};
        int[] B={10};
        System.out.println(maximumGap(A));
        System.out.println(maximumGap(B));
        
    }
    
    public static int maximumGap(int[] nums){
        if(nums.length==1){  //Given Constraints says array length goes from 1.
            return 0;
        }
        int count=0;
        int a=0;
        while(a<nums.length-1){
            count=Math.max(count,nums[a+1]-nums[a]);
            a++;
        }
        return count;
    }
}
