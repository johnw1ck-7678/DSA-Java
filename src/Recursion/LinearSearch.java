package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] A={3,2,1,18,9};
        System.out.println(check(A, 18, 0));
    }
    public static int check(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return check(arr, target,index+1);
    }
}
