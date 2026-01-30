package Leetcodes;

//https://leetcode.com/problems/single-number-ii/description/?envType=problem-list-v2&envId=bit-manipulation

public class SingleNumber2 {
    public static void main(String[] args) {
        int[] A={2,2,3,2};
        System.out.println(singleNumber(A));
    }
    public static int singleNumber(int[] nums){
        int result=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int x:nums){
                if((x&(1<<i))!=0){
                    count++;
                }
            }
            if((count%3)!=0){
                result = result|(1 << i);
            }
        }
        return result;
    }
}
