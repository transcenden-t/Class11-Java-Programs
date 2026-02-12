// a number is armstong if the sum of its digits raised to the power of the length of the
// number equals the number itself
// 371 = 3^3 + 7^3 + 1^3
import java.util.*;
public class ArmNum {
    int n,l;
    public ArmNum(int x)//constructor
    {
        n=x;
        l = ("" + n).length();
    }
    int sum_pow(int n)//returns the sum of each digit raised to the power of length of the number
    {
        if(n<=9)
            return (int)Math.pow(n, l);
        else 
            return (int)Math.pow((n%10) , l) + sum_pow(n/10);
    }
    void isArmstrong()//to display
    {
        if(n == sum_pow(n))
        System.out.println("Yes");
    else 
        System.out.println("no");
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        ArmNum obj = new ArmNum(x);
        obj.isArmstrong();
        in.close();
    }
    
}
