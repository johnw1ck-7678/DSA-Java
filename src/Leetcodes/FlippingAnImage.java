package Leetcodes;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/description/

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] A={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(A)));
    }
    public static int[][] flipAndInvertImage(int[][] image){

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                image[i][j]=image[i][j]^1;
            }
        }

        for(int i=0;i<image.length;i++){
            int a=0;
            int b=image[0].length-1;
            while(a<b){
                int temp=image[i][a];
                image[i][a]=image[i][b];
                image[i][b]=temp;
                a++;
                b--;
            }
        }
        return image;
    }
}
