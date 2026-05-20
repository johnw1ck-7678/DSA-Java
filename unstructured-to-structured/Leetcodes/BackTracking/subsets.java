
import java.util.*;

public class subsets {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<Integer> ls = new ArrayList<>();
        printSubset(arr, 0, ls);
    }

    static void printSubset(int[] arr, int i, List<Integer> ls) {
        if (i == arr.length) {
            System.out.println(ls);
            return;
        }
        // forward
        ls.add(arr[i]);
        printSubset(arr, i + 1, ls);
        // backtrack
        ls.remove(ls.size() - 1);
        printSubset(arr, i + 1, ls);

    }
}
