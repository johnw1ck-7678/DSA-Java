package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] A={5,4,3,2,1};
        System.out.println(Arrays.toString(merge(A)));
    }
    static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left= merge(Arrays.copyOfRange(arr,0,mid));
        int[] right=merge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArray(left,right);
    }
    static int[] mergeArray(int[] arr1,int[] arr2){
        
        int[] arr3=new int[arr1.length+arr2.length];
        
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i];
                i++;
            }else{
                arr3[k++]=arr2[j];
                j++;
            }
        }
        while(i<arr1.length){
            arr3[k++]=arr1[i];
            i++;
        }
        while (j<arr2.length) {
            arr3[k++]=arr2[j];
            j++;
        }

        return arr3;
    }
}
