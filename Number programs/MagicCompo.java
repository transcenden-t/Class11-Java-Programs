/*
Program: To check wether the number is a MagicCompo number or not
*/
import java.util.*;
public class MagicCompo {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter start and last");
        int start = in.nextInt();
        int last = in.nextInt();
        int temp,temp2,f=0,sum,smc=0;
        if(start>0 && last<500)
        {
        System.out.print("The MagicCompo numbers: ");
        for(int i=start;i<=last;i++)
        {
            temp = i;
            while(temp>9)
            {
                sum=0;
                while(temp>0)
                {
                    sum = sum + temp%10;
                    temp = temp/10;
                }
                temp=sum;
            }
            temp2=i;
            for(int j=1;j<=temp2;j++)
            {
                if(temp2%j==0)
                    f++;
            }
            if(f>2 && temp==1)
            {
                System.out.print(i+" ");
                smc++;
            }
            f=0;
        }
        System.out.println();
        System.out.println("Number of MagicCompos: "+smc);
     }
     else
        System.err.println("Invalid Number Range");
     
    }
    
}