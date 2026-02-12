import java.util.*;
public class Power_of_number {
    static int power(int a,int  b)
    {
        if(b==0)
            return 1;
        else 
            return a * power(a,b-1);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(power(a , b));
    }
    
}
