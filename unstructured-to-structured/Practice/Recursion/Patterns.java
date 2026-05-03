public class Patterns {
    //1st -- 
    /* *****
       ****
       ***
       **
       *
     */
    //2nd
    /*
        *
        **
        ***
        ****
        *****
    */

    public static void main(String[] args) {
        first(5, 0);
        second(5, 0);
    }
    static void first(int row,int column){
        if(row==0){
            return;
        }
        if(column<row){
            System.out.print("*");
            first(row, column+1);
        }else{
            System.out.println();
            first(row-1, 0);
        }
    }
    static void second(int row,int column){
        if(row==0){
            return;
        }
        if(column<row){
            second(row, column+1);
            System.out.print("*");
        }else{
            second(row-1,0);
            System.out.println();
        }
    }


}
