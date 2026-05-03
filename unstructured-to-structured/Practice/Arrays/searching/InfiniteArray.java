public class InfiniteArray {
    public static void main(String[] args) {
        int[] A1={2,3,4,5,6,7,89,90,121,123};
        System.out.println(findRange(A1, 7));//in infinite array last element willnot be printed
    }
    public static int findRange(int[] arr,int target){
        //start with size of 2
        int start=0;
        int end=1;

        while(target>arr[end]){
            int temp=end+1;
            end=end+2*(end-start+1);
            start=temp;
        }
        return BinarySearch(arr, target, start, end);

    }
    public static int BinarySearch(int[] arr,int target,int start,int end) {
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            
        }
        return -1;
    }
}
