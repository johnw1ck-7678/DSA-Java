import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    /*https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/*/
    public static void main(String[] args) {
        int[] A={2,2};
        System.out.println(findDisappearedNumbers(A));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{i++;}
        }
        List<Integer> g=new ArrayList<>();
        for(int z=0;z<nums.length;z++){
            if(nums[z]!=z+1){
                g.add(z+1);
            }
        }
        return g;

    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
