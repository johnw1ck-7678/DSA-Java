
// /https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/?envType=daily-question&envId=2026-05-15

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,0,2};

        System.out.println(findMin(nums));

    }
    public static int findMin(int[] nums){

        int start=0;
        int end=nums.length-1;

        while(start<=end){

            if(start==end){
                return nums[start];
            }
            
            int mid=start+(end-start)/2;

            if(nums[mid]>nums[end]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return -1;

    } 

}
