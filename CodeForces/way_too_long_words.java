import java.util.*;
public class way_too_long_words
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        in.nextLine();
        while(n-->0)
        {
            String st = in.nextLine();
            if(st.length()<11) System.out.println(st);
            else System.out.println(st.charAt(0)+(st.length()-2+"")+st.charAt(st.length()-1));
        }
    }
}