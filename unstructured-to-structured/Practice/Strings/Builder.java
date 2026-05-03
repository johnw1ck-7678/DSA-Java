public class Builder {
    public static void main(String[] args) {
        StringBuilder b=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            b.append(ch);
        }
        System.out.println(b.reverse());
    }
}
