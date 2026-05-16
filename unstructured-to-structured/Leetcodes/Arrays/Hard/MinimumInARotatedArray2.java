
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description

public class MinimumInARotatedArray2 {
    public static void main(String[] args) {
        int[] arr={2,2,2,0,1};
        System.out.println(findMin(arr));
        int[] arr2={1,1};
        System.out.println(findMin(arr2));
    }
    static int findMin(int[] nums){
        
        int start=0;
        int end=nums.length-1;
        int ans=Integer.MAX_VALUE;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==nums[start] && nums[mid]==nums[end]){ //for duplicate values

                ans=Math.min(ans, nums[mid]); //updating ans
                start=start+1;
                end=end-1;
                continue;

            }
            if(nums[mid]>=nums[start]){

                ans=Math.min(ans, nums[start]); //sorted parts 1st element will be minimum
                start=mid+1;
            }else{

                ans=Math.min(ans, nums[mid]);
                end=mid-1;
            }
        }
        return ans;
    }
}
