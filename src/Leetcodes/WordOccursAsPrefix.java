package Leetcodes;

//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/?envType=problem-list-v2&envId=string-matching

public class WordOccursAsPrefix {
    public static void main(String[] args) {
        String sentence = "i love eating burger";
        String searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence,searchWord));

    }    
    static int isPrefixOfWord(String sentence, String searchWord){
        String[] str=sentence.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].contains(searchWord) && str[i].indexOf(searchWord)==0){
                return i+1;
            }
        }
        return -1;
    }

}
