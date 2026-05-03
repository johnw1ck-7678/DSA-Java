//https://leetcode.com/problems/single-number/description/

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int count=0;
        for(int x:nums){
            count=count^x;
        }
        return count;
    }
}
