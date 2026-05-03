//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/?envType=daily-question&envId=2026-03-06

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