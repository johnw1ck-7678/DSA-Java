import java.util.Arrays;

public class MoveZeros {
    //https://leetcode.com/problems/move-zeroes/description/?envType=problem-list-v2&envId=array
    public static void main(String[] args) {
        int[] A={0,1,0,3,12};
        moveZeros(A);
    }
    public static void moveZeros(int [] nums){
        int k=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]!=0){
                nums[k++]=nums[i];
                
            }
            
        }
        while(k<nums.length){
           nums[k++]=0;
            
        }
    
        System.out.println(Arrays.toString(nums));
    }
}
