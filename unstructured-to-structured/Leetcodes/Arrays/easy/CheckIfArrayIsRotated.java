
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/?envType=daily-question&envId=2026-05-23

public class CheckIfArrayIsRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums){

        int n=nums.length;
        int count=1;

        for(int i=1;i<2*n;i++){  //double the array 

            if(count==n){     //check sorted array of length nums
                return true;
            }
            if(nums[(i-1)%n]<=nums[i%n]){
                count++;
            }else{
                count=1;
            }
        }
        return false;




    } 
}
