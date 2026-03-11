package Recursion;


public class AsciiValue {
    public static void main(String[] args) {
        String string="ab";
        subsetascii("",string);
    }
    static void subsetascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsetascii(p, up.substring(1));
        subsetascii(p+ch, up.substring(1));
        subsetascii(p+(ch+0), up.substring(1));
    }

}
