package Leetcodes;

//https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/description/

public class XOROfNumberTwice {
    public static void main(String[] args) {
        int[] arr={10,10,7,18,18};
        System.out.println(duplicateNumbersXOR(arr));
    }

    public static int duplicateNumbersXOR(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]^nums[j])==0){
                    count=count^nums[i];
                }
            }
        }
        return count;
    }
}