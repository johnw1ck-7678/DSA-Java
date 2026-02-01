package Leetcodes;

import java.util.HashSet;

//https://leetcode.com/problems/happy-number/description/?envType=problem-list-v2&envId=hash-table

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(49));
    }
    public static boolean isHappy(int n){

        HashSet<Integer> set=new HashSet<>();

        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n=square(n);
        }
        return true;
    }
    public static int square(int a){
        int sum=0; 
        while(a!=0){
            int c=a%10;
            sum=sum+c*c;
            a=a/10;
        } 
        return sum;

    }
}
