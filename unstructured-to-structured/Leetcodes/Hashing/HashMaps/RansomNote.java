
//https://leetcode.com/problems/ransom-note/description/

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa"; 
        String magazine = "aaab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    static boolean canConstruct(String ransomNote, String magazine){

        HashMap<Character,Integer> mp1=new HashMap<>(); //of ransomNote
        HashMap<Character,Integer> mp2=new HashMap<>(); //of magazine

        for(char x : ransomNote.toCharArray()){
            if(mp1.containsKey(x)){
                mp1.put(x,  mp1.get(x)+1);
            }else{
                mp1.put(x, 1);
            }
        }

        for(char x : magazine.toCharArray()){
            if(mp2.containsKey(x)){
                mp2.put(x, mp2.get(x)+1);
            }else{
                mp2.put(x,1);
            }
        }

        for(char x : mp1.keySet()){   //if mp1 is subset of mp2
            if(!mp2.containsKey(x) || mp2.get(x)<mp1.get(x)){
                return false;
            }
        }

        return true;

    }
}
