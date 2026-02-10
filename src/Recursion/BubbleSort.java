package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={52,4,5,67,42};
        sort(a, a.length-1, 0);
    }
    static void sort(int[] arr,int n,int i){

        if (n == 0) {
            System.out.println(Arrays.toString(arr));
            return;

        }

        // end of one pass
        if (i == n) {
            sort(arr, n - 1, 0);
            return;
        }

        if (arr[i] > arr[i + 1]) {
            swap(arr, i, i + 1);
        }

        sort(arr, n, i + 1);
    }
        
    
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
