import java.util.List;

//https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/description/

public class Acronym {
        public static void main(String[] args) {
            List<String> lis=List.of("alice","bob","charlie");
            String s="abc";
            System.out.println(isAcronym(lis, s));
        }
        public static boolean isAcronym(List<String> words, String s){
            int n=words.size();
            String y="";
            for(int i=0;i<n;i++){
                y=y.concat(String.valueOf(words.get(i).charAt(0)));
            }
            if(y.equals(s)){
                return true;
            }
            return false;
        }
}
