public class OrderAgnosticBinarySearch{
    /*Order Agnositc = We don't know whether the array is sorted in Ascending Order or Descending Order */
    public static void main(String[] args) {

        int[] A1= {3,3,5,6,8,9};//Ascending Order Sorted Array
        int[] A2={67,45,23,19};//Descending Order Sorted Array

        System.out.println(search(A1,6));
        System.out.println(search(A2,45));
    }
    public static int search(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        boolean a=arr[start]<arr[end]; //if true array is ascending and ifnot it is descending

        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]==target){
                return mid;
            }
            if(a){
                if(arr[mid]<target){
                    start=mid+1; 
                }else if(arr[mid]>target){  //Code for Ascending Array
                    end=mid-1;
                }
            }else{
                if(arr[mid]<target){
                    end=mid-1;
                }else if(arr[mid]>target){ //Code for Descending Array
                    start=mid+1;
                }
            }

        }
        return -1; //if Given Element isnot Found in Array

    }



}