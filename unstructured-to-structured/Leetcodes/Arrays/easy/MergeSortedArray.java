import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/?envType=problem-list-v2&envId=sorting
//Time Complexity=O((m+n)log(m+n))

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; 
        int m = 3;
        int[] nums2 = {2,5,6}; 
        int n = 3;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int count=0;
        for(int i=0;i<m;i++){
            nums1[count]=nums1[i];
            count++;
        }
        for(int i=0;i<n;i++){
            nums1[count]=nums2[i];
            count++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
