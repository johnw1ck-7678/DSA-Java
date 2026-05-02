package Leetcodes;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=string-matching

public class IndexOfFirstOccurenceOfString {
    public static void main(String[] args) {
        String haystack = "prafull";
        String needle = "ik";
        System.out.println(strstr(haystack,needle));
    }
    public static int strstr(String haystack,String needle){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
