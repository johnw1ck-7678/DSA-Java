
//This program (MazeProblem) uses recursion to generate and print all possible paths from the top-left corner to the bottom-right corner of a grid.
//(3,3)   (3,2)   (3,1)
//(2,3)   (2,2)   (2,1)
//(1,3)   (1,2)   (1,1)

public class MazeProblem {
    public static void main(String[] args) {
        maze("",3, 3);
    }
    static void maze(String s,int r,int c){
        if(r==1 && c==1){
            System.out.println(s);
            return;
        }
        if(r>1){
           maze(s+'R', r-1, c);
        }
        if(c>1){
            maze(s+'D', r, c-1);
        }
            
        
        
        

    }
}
