
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

public class RotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2}; 
        int target = 0;
        System.out.println(search(nums, target));
    }
    public static boolean search(int[] nums, int target){

        int start=0;
        int end=nums.length-1;

        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                start=start+1;
                end=end-1;
                continue;
            }
            if(nums[mid]>=nums[start]){
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            if(nums[mid]<=nums[end]){
                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                }else{
                    end=end-1;
                }
            }

        }
        return false;


    }
}
