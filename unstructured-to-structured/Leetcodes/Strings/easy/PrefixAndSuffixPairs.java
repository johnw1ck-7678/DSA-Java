//https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/?envType=problem-list-v2&envId=string-matching

public class PrefixAndSuffixPairs {
    public static void main(String[] args) {
        String[] words= {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }
    static int countPrefixSuffixPairs(String[] words){
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i], words[j]))
                {
                    count++;
                }
            }
            
        }
        return count;
    }
    static boolean isPrefixAndSuffix(String str1,String str2){
        int a=str2.length()-str1.length();
        if(str2.indexOf(str1)==0 && str2.lastIndexOf(str1)==a){
            return true;
        }
        return false;
    }
    
}
