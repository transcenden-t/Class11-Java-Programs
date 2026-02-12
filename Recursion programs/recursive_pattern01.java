// print this using recursion
// 1
// 1 2
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5
//using only void rec(int r, int c)
public class recursive_pattern01
{
    @SuppressWarnings("UnnecessaryReturnStatement")
    static void rec(int r, int c)
    {
        
        if(r>5)
            return;
        else if(c>r){
            System.out.println();
            rec(r+1,1);
        }
        else{
            System.out.print(c);
        rec(r,c+1);}
    }
    public static void main(String args[])
    {
        recursive_pattern01.rec(1, 1 );
    }
}