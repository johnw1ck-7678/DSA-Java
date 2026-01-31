package Leetcodes;

//https://leetcode.com/problems/count-primes/description/?envType=problem-list-v2&envId=math

public class CountPrimes {
    public static void main(String[] args) {
        
        System.out.println(countPrimes(3));
    }

    public static int countPrimes(int n){

        if(n<=1){
            return 0;
        }

        else if(n==2){
            return 0;
        }

        int[] arr=new int[n]; //As Strictly Less than n 

        for(int i=0;i<n;i++){
            arr[i]=1;
        }

        for(int i=2;i<=((int)(Math.pow(n,0.5)));i++){
            if(isPrime(i)){
                for(int j=i*i;j<n;j=j+i){
                    arr[j]=0;
                }
            }
        }

        int count=0;
        for(int i=2;i<n;i++){ //array index 0 and 1 values are unchanges means 1; 
            if(arr[i]==1){
                count++;
            }
        }
        return count;
        
    }
    //checking if prime or not
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else if(n==2){
            return true;
        }
        int a=2;
        while(n>2 && a<n){
            if((n%a)==0){
                return false;
            }
            a++;
        }
        return true;
        
    }
}
