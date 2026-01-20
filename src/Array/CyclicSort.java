import java.util.Arrays;

public class CyclicSort {
    //for only given number are in range (1,N)
    public static void main(String[] args) {
        int[] A={4,3,2,7,8,2,3,1};
        CycleSort(A);
       
    }
    public static void CycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
                
            }else{i++;}
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr1,int a,int b){
        int temp=arr1[a];
        arr1[a]=arr1[b];
        arr1[b]=temp;
    }
}
