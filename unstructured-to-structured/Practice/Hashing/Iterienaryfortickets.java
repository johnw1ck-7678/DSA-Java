package HashSetMap;

import java.util.HashMap;

public class Iterienaryfortickets {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();

        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start=RoutePlanner(map);
        while(map.containsKey(start)){
            System.out.print(start+"-->");
            start=map.get(start);
        }
        System.out.print(start);

    }
    public static String RoutePlanner(HashMap<String,String> map2){
        HashMap<String,String> revmap=new HashMap<>();

        for(String x:map2.keySet()){
            revmap.put(map2.get(x), x);
        }
        for(String x:map2.keySet()){
            if(!revmap.containsKey(x)){
                return x;
            }
        }
        return null;


    }

}
