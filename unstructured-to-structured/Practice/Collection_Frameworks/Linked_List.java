import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(34);
        ll.add(78);
        ll.add(76);
        System.out.println(ll);
        ll.addFirst(60);
        ll.addLast(7);
        System.out.println(ll);
        System.out.println(ll.peek());
        System.out.println(ll.peekLast());
        System.out.println(ll.poll());
        System.out.println(ll.size());
        ll.add(4,78);
        System.out.println(ll);
        //Use Linked List in Insertion/Deletion...........o(1)
    }
}
