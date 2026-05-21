
//https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/description/?envType=daily-question&envId=2026-05-21

import java.util.*;

public class LengthOfLongestPrefix {

    public static void main(String[] args) {
        int[] arr1 = { 1, 10, 100 };
        int[] arr2 = { 1000 };
        System.out.println(longestCommonPrefix(arr1, arr2));
    }

    static int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();

        for (int x : arr1) {

            while (x > 0) {
                st1.add(x);
                x = x / 10;
            }

        }

        for (int x : arr2) {

            while (x > 0) {
                st2.add(x);
                x = x / 10;
            }

        }

        int max = 0;

        for (int x : st2) {
            if (st1.contains(x)) {
                max = Math.max(max, digits(x));
            }
        }

        return max;

    }

    static int digits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}