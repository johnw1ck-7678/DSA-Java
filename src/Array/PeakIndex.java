public class PeakIndex {
    public static void main(String[] args) {
        int[] A1={3,4,5,1};
        System.out.println(peakIndexInMountainArray(A1));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }

        return start;
    }
}
