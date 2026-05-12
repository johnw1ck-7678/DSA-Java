import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        ll.add(25);
        ll.add(58);
        ll.add(6);
        ll.add(5);
        ll.add(7);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
        
        ll.sort(null); //sorting in reverse order
        System.out.println(ll);
        System.out.println(ll.reversed());

        System.out.println(ll.indexOf(7));
        System.out.println(ll.contains(7));
        
        //Collections is a Interface and ArrayList, LinkeList, Stack, Queue are concrete classes
        //Collections(interface) -> List(interface) -> ArrayList()

        //use ArrayList for searching........ O(1)


    }
}
