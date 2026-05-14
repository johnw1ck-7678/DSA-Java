
//https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "leeltcode";
        System.out.println(firstUniqChar(s));
    }
    static int firstUniqChar(String s){

        HashMap<Character,Integer> mp=new HashMap<>();

        for(char x : s.toCharArray()){
            if(mp.containsKey(x)){
                mp.put(x, mp.get(x)+1);
            }else{
                mp.put(x, 1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;


    }
}
