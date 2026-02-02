package Leetcodes;

import java.util.HashMap;

public class SubArraysSumEqualsK {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int k=3;
        System.out.println(subarraySum(a, k));
    }
    public static int subarraySum(int[] nums, int k){
        int pref=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,1);
        for(int x:nums){
            pref=pref+x;

            if(map.containsKey(pref-k)){
                count=count+map.get(pref-k);
               
            }
           map.put(pref,map.getOrDefault(pref, 0)+1);
        }
        return count;
    }
}
