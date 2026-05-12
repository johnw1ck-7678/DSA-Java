import java.util.Arrays;

//https://leetcode.com/problems/rotate-image/description/?envType=daily-question&envId=2026-05-04

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix){
        int n=matrix.length;

        //1st Transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //Now Reverse
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){ //n/2 because if n then values will get reversed twice means no change
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        System.out.print(Arrays.deepToString(matrix)); //remove for leetcode
    }
}
