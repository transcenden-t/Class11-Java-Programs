//153=1^3+5^3+3^3
import java.util.Scanner;
public class recursive_armstrong_hard {
    static int sum=0;
    public static boolean isArm(int n)
    {
        int sum=0;
        int temp=n,temp1=n;
        int tempd=0;
        while(temp>0)
        {
            temp/=10;
            tempd++;
        }
        while(temp1>0)
        {
            sum = sum+ (int)Math.pow(temp1%10 , tempd);
            temp1/=10;
        }
        return (sum==n) ? true : false ;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(isArm(a));
    }
}
