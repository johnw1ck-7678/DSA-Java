import java.util.*;

//Note : Here Mobile keypad used has mapping as follows.

// 1-abc
// 2-def
// 3-ghi
// 4-jkl
// 5-mno
// 6-pqr
// 7-stu
// 8-vwx
// 9-yz

public class LetterCombintionOnPhone {
    public static void main(String[] args) {
        System.out.println(combination("", "19"));
    }
    static List<String> combination(String p,String up){
        if(up.isEmpty()){
            List<String> lis=new ArrayList<>();
            lis.add(p);
            return lis;
        }
        
        int digit=up.charAt(0)-'0';
    
        List<String> lis=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3 && i<26;i++){
        
            char ch=(char)('a'+i);
        
            lis.addAll(combination(p+ch, up.substring(1)));
            
        }
        return lis;
    }
}
