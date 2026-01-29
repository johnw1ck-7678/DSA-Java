package BitManipulation;
//is number odd or even
public class OddEven {
    public static void main(String[] args) {
        System.out.println(EvenNumber(547));
    }
    public static boolean EvenNumber(int n){
        if((n&1)==1){
            return false;
        }
        return true;
    }
}


