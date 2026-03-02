import java.util.*;
public class new_year_and__hurry
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int tt=240-k;
        int ttnfp;
        int num=0;
        for(int i=1;i<=n;i++)
        {
            ttnfp=5*i;
            if(tt-ttnfp<0) break;
            else { tt-=ttnfp; num++; }
        }
        System.out.println(num);
    }
}
