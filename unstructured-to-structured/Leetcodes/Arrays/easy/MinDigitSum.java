public class MinDigitSum {
    public static void main(String[] args) {
        int[] nums={10,12,13,14};
        System.out.println(minElement(nums));
    }
    public static int minElement(int[] nums) {
        int count=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]>0){
                sum=sum+nums[i]%10;
                nums[i]=nums[i]/10;
            }
            count=Math.min(count,sum);
        }
        return count;
    }
}
