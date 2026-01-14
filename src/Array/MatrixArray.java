import java.util.Arrays;

public class MatrixArray{
    public static void main(String[] args) {
        int[][] a={
            {2,3,5,7},
            {34,35,56,78},
            {80,81,82,83}  //sorted 2D Array row wise and column wise
        };
        System.out.println(Arrays.toString(search(a, 83)));
    }
    public static int[] search(int[][] arr,int target){
        int row=0;
        int column=arr[0].length-1;
        
        while(row<arr.length && column>=0){
            if(arr[row][column]==target){
              return new int[]{row,column};
            }else if(arr[row][column]>target){
                column--;
            }else if(arr[row][column]<target){
                row++;
            }
        }
        return new int[] {-1,1};
    }
}