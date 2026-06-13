
//https://leetcode.com/problems/weighted-word-mapping/?envType=daily-question&envId=2026-06-13  

public class WeightedWordMapping {
    public static void main(String[] args) {
        String[] words = {"abcd","def","xyz"};
        int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words, weights));
    }
    static String mapWordWeights(String[] words, int[] weights) {
        
        StringBuilder st=new StringBuilder();
        for(String x : words){
            int sum=0;
            
            for(char ch : x.toCharArray()){
                sum = sum + weights[ch-'a'];
            }
            int rem = sum%26;
            char s=(char)('z'-rem);
            st.append(s);
        }
        return st.toString();
    }
}
