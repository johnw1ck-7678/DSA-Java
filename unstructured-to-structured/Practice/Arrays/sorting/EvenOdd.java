import java.util.Arrays;

public class EvenOdd {
    //All even numbers in an array should be followed by odd numbers 
    public static void main(String[] args) {
        int[] arr={5,26,7,9,22,67};
        System.out.println(Arrays.toString(oddEven(arr)));
    }
    public static int[] oddEven(int[] arr){
        int i=0;
        int j=0;
        int[] answer=new int[arr.length];
        while(i<arr.length && j<arr.length){
            if(arr[i]%2==0){
                answer[j++]=arr[i];
                i++;
            }else{
                i++;
            }
            
        }
        i=0;
        while(j<arr.length && i<arr.length){
            if(arr[i]%2!=0){
                answer[j]=arr[i];
                j++;
                i++;
            }else{
                i++;
            }
            
        }
        return answer;
    }
}
