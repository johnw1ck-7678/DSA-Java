import java.util.HashMap;

public class FruitsIntoBaskets {
    public static void main(String[] args) {
        int[] fruits={1,2,1};
        System.out.println(totalFruit(fruits));
    }
    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int low=0;
        int max=0;

        for(int high=0;high<fruits.length;high++){
            if(mp.containsKey(fruits[high])){
                mp.put(fruits[high],mp.get(fruits[high])+1);
            }else{
                mp.put(fruits[high],1);
            }
            while(mp.size()>2){
                mp.put(fruits[low],mp.get(fruits[low])-1);
                if(mp.get(fruits[low])==0){
                    mp.remove(fruits[low]);
                }
                low++;
            }
            max=Math.max(max,high-low+1);
        }
        return max;
    }
}
