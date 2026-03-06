    import java.util.*;
    public class disarium_number
    {
        public static boolean rec(int n, int x, int i)
        {return n==0 ? x==0 : rec(n/10,x-(int)Math.pow(n%10,i),i-1);}
        public static void main(String args[])
        {
            Scanner in = new Scanner(System.in);
            int a=in.nextInt();
            System.out.println(rec(a,a,(""+a).length()));
        }
    }