public class HeightChecker {
    public static void main(String[] args) {
        int[] arr={1,1,4,2,1,3};
        //heights:  [1,1,4,2,1,3]
        //expected: [1,1,1,2,3,4]
        //Indices 2, 4, and 5 do not match.
        //Output: 3
        System.out.println(heightChecker(arr));
    }
     public static int heightChecker(int[] heights) {
        int a[] =new int[heights.length];
        for(int i=0;i<heights.length;i++){
            a[i]=heights[i];
        }
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        int count=heights.length;
        for(int i=0;i<heights.length;i++){
            if(a[i]==heights[i]){
                count--;
            }
        }
        return count;
    }
}
