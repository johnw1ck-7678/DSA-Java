import java.util.Arrays;

public class FirstAndLastPosition { 
    /*
    find the first and last position of a given 
    element in a sorted array.
    Our Output should be First index of Occurence
    of that element and Last index of Occurence
    of that same element
    */
    public static void main(String[] args) {
        int[] A1={5,7,7,7,7,8,8,10};
        /*
        for 7 it should output [1,4]
        As first apperance of 7 is at
        index 1 and last appearance of 
        7 is at index 4
        */ 
       System.out.println(Arrays.toString(func1(A1,7)));

    }
    public static int[] func1(int[] arr,int target1){
        int[] A1=new int[2];
        A1[0]=func2(arr, target1, true);
        A1[1]=func2(arr, target1, false);
        return A1;

    }
    public static int func2(int[] arr2,int target2,boolean FirstIndex){
        int ans=-1;
        int start=0;
        int end=arr2.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr2[mid]>target2){
                end=mid-1;
            }else if(arr2[mid]<target2){
                start=mid+1;
            }else {
                ans=mid;
                if(FirstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                
            }
        }
        return ans;
    }


    
}
