import java.util.Arrays;

public class SquareOfArray {
    public static void main(String[] args) {
        int[] A1={2,5,3,8,11};
        System.out.println(Arrays.toString(square(A1)));

    }
    public static int[] square(int[] arr){
        int[] A2=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            A2[i]=arr[i]*arr[i];
        }
        
        Arrays.sort(A2);
        return A2;
    }
}
