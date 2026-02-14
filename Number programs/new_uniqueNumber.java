/*
Program: To check wether the number is a Unique number or not
*/
import java.util.*;
public class new_uniqueNumber {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int temp=a;
        int dih;
        int temp2;
        int brainrot = 69;
        while(temp>0)
        {
            dih=temp%10;
            temp2=temp/10;
            while(temp2>0)
            {
                if(temp2%10==dih)
                {
                    brainrot = 67;
                    break;
                }
                temp2=temp2/10;
            }
            temp = temp/10;
        }
        System.out.println((brainrot==69)? "Yes" : "No");
        
    }
}
