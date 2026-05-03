import java.util.HashMap;

//https://leetcode.com/problems/majority-element/description/

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={3,2,3};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], (map.get(nums[i])+1));
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int x: map.keySet()){
            if(map.get(x)>(nums.length/2)){
                return x;
            }
        }

        return 0;
    }
}
