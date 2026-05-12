import java.util.*;

public class Queue_using_Stacks {

    static Stack<Integer> s1;
    static Stack<Integer> s2;
    public static void main(String[] args) {

        s1=new Stack<>();
        s2=new Stack<>();

        enqueue(5);
        enqueue(6);
        enqueue(8);

        System.out.println(dequeue());
        System.out.println(empty());

    }
    static void enqueue(int x){

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    static int dequeue(){
        return s1.pop();
    }

    static boolean empty(){
        return s1.isEmpty();
    }

}
