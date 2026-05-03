//https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/description/

public class XORsumOFAllPairsBitwiseAND{
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={6,5};
        System.out.println(getXORSum(arr1, arr2));
    }

    public static int getXORSum(int[] arr1, int[] arr2){
        int count=0;
        int count2=0;
         
        for(int i=0;i<arr1.length;i++){
            count=count^arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            count2=count2^arr2[i];
        }
        return (count&count2);
    }
}