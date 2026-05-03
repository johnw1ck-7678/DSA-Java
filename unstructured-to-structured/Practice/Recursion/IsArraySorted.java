public class IsArraySorted {
    public static void main(String[] args) {
        int[] A={1,3,4,8,9,12};
        System.out.println(sortArray(A, 1));
    }
    public static boolean sortArray(int[] arr,int index){
        if(index==arr.length){
            return true;
        }
        return ((arr[index-1]<arr[index])&&(sortArray(arr, index+1)));
    }
}
