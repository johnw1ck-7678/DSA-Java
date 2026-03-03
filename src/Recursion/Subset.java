package Recursion;

import java.util.Arrays;

public class Subset {
    public static void main(String[] args) {
       String string="abc";
        subset("",string);
    }
    public static void subset(String p,String u){
        if(u.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=u.charAt(0);
        subset(p,u.substring(1));
        subset(p+ch, u.substring(1));
        
    }
}
