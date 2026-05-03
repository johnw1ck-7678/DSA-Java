//https://leetcode.com/problems/sqrtx/?envType=problem-list-v2&envId=math

//By Newton's Raphson Method i.e √x = (n+(x/n))*0.5 where n is any guess we make 
//loop that takes value of guess close to root where absolute error is less than 0.5 

public class SqrtOfNumber {
    public static void main(String[] args) {
      System.out.println(mySqrt(8));  
    }
    public static int mySqrt(int x){
        double n=x/2;  //n be any guess number
        double root;
        while(true){
            root=0.5*(n+(x/n));
            if(Math.abs(root-n)<0.5){
                break;
            }
            n=root;
        }
        return (int)root;
    }
}
