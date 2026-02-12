//What is a unique number ?
//ans) it is a number where none of its digits are repeated
// 121 - No
//345 - Yes
import java.util.*;
public class UniqueNumber
{
    public static boolean checknum(int a) {
        int temp = a;
        while(temp>0)
        {
            int digit = temp%10;
            int temp2=temp/10;
            while(temp2>0)
            {
                if(temp2%10==digit)
                    return false;
                temp2=temp2/10;
            }
            temp=temp/10;
        }
        return true;
    }
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(UniqueNumber.checknum(n));
    }
}