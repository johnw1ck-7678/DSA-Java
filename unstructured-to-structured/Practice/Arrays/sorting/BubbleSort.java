import java.util.Arrays;

//Time Complexity = O(N^2)
/*Bubble Sort is a simple comparison-based sorting algorithm. 
It repeatedly steps through the list, compares adjacent elements, 
and swaps them if they are in the wrong order. */

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={52,4,5,67,42};
        System.out.println(Arrays.toString(sort(a)));
    }
    public static int[] sort(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                    
            }
        }
        return arr;
    }
}
