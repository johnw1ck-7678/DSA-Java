public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] A={5,6,7,8,9,1,2,3};
        int a=A.length-1;
        System.out.println(search(A, 8, 0, a));
    }
    static int search(int[] arr,int target,int s,int e){
        int m=s+(e-s)/2;
        if(s>e){
            return -1;
        }
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(target>arr[s] && target<arr[m]){
                return search(arr, target, s, m-1);
            }else{
                return search(arr, target, m+1, e);
            }
        }
        if(target<=arr[e] && target>=arr[m]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }
}
