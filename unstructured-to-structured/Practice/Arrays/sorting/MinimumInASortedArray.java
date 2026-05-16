
public class MinimumInASortedArray {
    public static void main(String[] args) {
        int[] arr={7,8,1,2,3,4,5,6};
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr){
        int s=0;
        int e=arr.length-1;
        int min=Integer.MAX_VALUE;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[s]<=arr[e]){
                min=Math.min(min, arr[s]);
                break;
            }
            if(arr[m]>=arr[s]){
                min=Math.min(min, arr[s]);
                s=m+1;
            }
            else{ //if(arr[m]<=arr[e])
                min=Math.min(min, arr[m]);
                e=m-1;
            }
        }
        return min;
        
    }
}
