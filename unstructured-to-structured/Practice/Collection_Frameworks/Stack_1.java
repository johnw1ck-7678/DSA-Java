import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(67);
        st.push(56);
        st.push(78);
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.search(67)); //top element == 1 indexing
        System.out.println(st.pop());
    }
}
