import java.util.*;
public class bitpp
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        int x=0;
        String st;
        while(n-->0)
        {
            st=in.nextLine();
            x=(st.indexOf('+')!=-1) ? x+1 : x-1;
        }
        System.out.println(x);
    }
}