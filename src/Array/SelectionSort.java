import java.util.Arrays;
/*It repeatedly selects the smallest (or largest) element from the unsorted portion 
of the array and places it at its correct position. */
//Time Complexity=O(N^2)
public class SelectionSort {
    public static void main(String[] args) {
        int[] a={5,6,23,7,9,0,-2};
        SelectionSorting(a);
    }
    public static void SelectionSorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            int Last=arr.length-i-1;
            int maxIndex=maxIndex1(arr,0,Last);
            int temp=arr[Last];
            arr[Last]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
       
    public static int maxIndex1(int[] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
