import java.util.*;
public class team
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int p,v,t,num=0;
        while(n-->0)
        {
            p=in.nextInt();
            v=in.nextInt();
            t=in.nextInt();
            if((p+v+t)>=2) num++;
        }
        System.out.println(num);
    }
}