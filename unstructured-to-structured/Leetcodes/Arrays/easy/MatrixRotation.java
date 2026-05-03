//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/?envType=daily-question&envId=2026-03-22

public class MatrixRotation{
    public static void main(String[] args) {
        int[][] arr1={{0,1},{1,0}};
        int[][] arr2={{1,0},{0,1}};
        System.out.println(findRotation(arr1,arr2));
    }
   
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) return true;
            rotate(mat);
        }
        return false;
    }

    // Rotate matrix 90° clockwise (in-place)
    public static void rotate(int[][] mat) {
        int n = mat.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Compare two matrices
    private static boolean isEqual(int[][] a, int[][] b) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
    
}