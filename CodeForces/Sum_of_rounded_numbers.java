import java.util.*;
public class Sum_of_rounded_numbers
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-->0) 
        {
            int a=in.nextInt();
            int temp=a;
            int temp1=a;
            int dig=0,result=0;
            while(temp>0) 
            {
                dig++;
                temp/=10;
            }
            while(temp1>0)
            {
                if(temp1%10!=0) result++;
                temp1/=10;
            }
            System.out.println(result);
            for(int i=0;i<dig;i++)
            {
                if(a%10!=0) System.out.print((int)(a%10)*(int)Math.pow(10,i)+" ");
                a/=10;
            }
            System.out.println();
        }
    }
}