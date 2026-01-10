public class BinarySearch {
    public static void main(String[] args) {
        /*Consider Already Sorted Array */
        /*it returns index value of target element and if element is not found returns -1 */
       int[] array ={1,2,3,4,5,6,7,8};
       System.out.println(search(array,0));
    }
    public static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2; /*for large start and end int will exceed the range.Therefore that formula is used*/
            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}
