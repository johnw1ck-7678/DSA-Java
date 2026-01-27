package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] A={2,3,4,5,6,7};
        System.out.println(bSearch(A,7,0,5));
    }
    public static int bSearch(int [] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]>target){
            return bSearch(arr, target, s, mid-1);
        }else if(arr[mid]<target){
            return bSearch(arr, target, mid+1, e);
        }
        return mid;
       
        
    }
}
