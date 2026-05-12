import java.util.*;
public class Stack_using_Queues {
    
    //using stacks and its method to Implement a Queue
    static Queue<Integer> q1; //static references 
    static Queue<Integer> q2;
    public static void main(String[] args) {
         
        q1=new LinkedList<>();
        q2=new LinkedList<>();
        push(5);
        push(6);
        push(7);
        System.out.println(pop());

    }
    static void push(int x){

        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }

        q1.add(x);

        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }

    }
    static int pop(){
        return q1.poll();
    }
    static boolean empty(){
        return q1.isEmpty();
    }
    
}
