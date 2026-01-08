public class CeilingOfNumber {
     /*
     In Sorted Ascending Array Ceiling of Number is The smallest 
    element in the array that is greater than or equal to target element
     */
    public static void main(String[] args) {
        int[] A1={2,3,5,9,14,16,18};
        System.out.println(ceiling(A1,0));
    }

    public static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
       
        if(target>arr[end]){
            return -1; //Elements greater than last array element willnot have ceiling
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return target;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }
        }
        return arr[start];
    }
}
