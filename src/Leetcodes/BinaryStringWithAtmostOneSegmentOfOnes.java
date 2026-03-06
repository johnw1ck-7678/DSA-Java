package Leetcodes;

public class BinaryStringWithAtmostOneSegmentOfOnes {

    public static void main(String[] args) {
        String s="111100";
        System.out.println(checkOnesSegment(s));
    }
    public static boolean checkOnesSegment(String s) {
        if(s.contains("01")){return false;}
        return true;
    }
}