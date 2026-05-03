
public class SkipCharacter{
    public static void main(String[] args) {
        String str="bcaaadda";
        stream("",str);
    }
    public static void stream(String p,String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        if(ch!='a'){
            stream(p+ch, s.substring(1));
        }else{
            stream(p, s.substring(1));
        }

    }

}