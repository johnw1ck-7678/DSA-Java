//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=array

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,4};
        System.out.println(removeDuplicates(arr));
    }  
    static int removeDuplicates(int[] nums) {
       int i=0;
       for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
