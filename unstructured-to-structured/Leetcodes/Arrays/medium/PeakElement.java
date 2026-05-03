// A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
// You must write an algorithm that runs in O(log n) time.
//Leetcode Medium

//https://leetcode.com/problems/find-peak-element/description/

public class PeakElement {
    public static void main(String[] args) {
        int[] A= {1,2,1,3,5,6,4};
        System.out.println(peakIndex(A));
    
    
    }
    public static int peakIndex(int[] arr){
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
