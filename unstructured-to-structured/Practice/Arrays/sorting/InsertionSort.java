import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] A={5,3,1,2};
        Insertion(A);
    }
    public static void Insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
    }
}
