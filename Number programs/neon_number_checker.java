import java.util.*;
public class neon_number_checker {
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          int a = in.nextInt();
          int b=a*a;
          int sum = 0;
          while(b>0)
          {
            sum=sum + b%10;
            b=b/10;
          }
         System.out.println((a == sum) ? "Yes" : "No");
    }
}