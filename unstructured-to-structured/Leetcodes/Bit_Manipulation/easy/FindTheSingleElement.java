//https://leetcode.com/problems/single-number/description/

public class FindTheSingleElement {
    public static void main(String[] args) {
        int[] A={5,4,3,3,4,9,5};
        System.out.println(SingleElement(A));
    }
    public static int SingleElement(int[] arr){
        int mis=0;
        for(int x:arr){
            mis=x^mis;
        }
        return mis;
    }
}
