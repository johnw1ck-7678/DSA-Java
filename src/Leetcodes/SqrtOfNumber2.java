package Leetcodes;

//https://leetcode.com/problems/sqrtx/?envType=problem-list-v2&envId=math
//Sorted Numbers and Applying Binary Method 

public class SqrtOfNumber2 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x){

        if(x==0 || x==1){ return x; }

        int s=1;
        int e=x;
        int ans=0; //Stores approx. int value of close root of number 
        
        while(s<e){
            int mid=s+(e-s)/2;

            if (mid <= x / mid) {   // avoids overflow
                ans = mid;          // store possible answer
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        return ans;

    }
}
