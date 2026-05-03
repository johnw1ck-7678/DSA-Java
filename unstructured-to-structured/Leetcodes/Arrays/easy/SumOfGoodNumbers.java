//https://leetcode.com/problems/sum-of-good-numbers/description/

public class SumOfGoodNumbers {
    public static void main(String[] args) {
        int[] A={1,3,2,1,5,4};
        System.out.println(sumOfGoodNumbers(A, 2));
    }
    public static int sumOfGoodNumbers(int[] nums, int k){
        int c=0;
        for(int i=0;i<nums.length;i++){
            int a=i-k;
            int b=i+k;
            if(a>=0 && b<nums.length){
                if(nums[i]>nums[a] && nums[i]>nums[b]){
                    c=c+nums[i];
                }
            }else if(a>=0 && b>=nums.length){
                if(nums[i]>nums[a]){
                    c=c+nums[i];
                }
            }else if(a<0 && b<nums.length){
                if(nums[i]>nums[b]){
                    c=c+nums[i];
                }
            }else if(a<0 && b>=nums.length){
                c=c+nums[i];
            }
        }
        return c;
    }

}
