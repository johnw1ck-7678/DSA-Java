public class CheckIfArrayIsRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,2,5,1};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums){

        int n=nums.length;
        int count=1;

        for(int i=1;i<2*n;i++){
            if(count==n){
                return true;
            }
            if(nums[(i-1)%n]<=nums[i%n]){
                count++;
            }else{
                count=1;
            }
        }
        return false;




    } 
}
