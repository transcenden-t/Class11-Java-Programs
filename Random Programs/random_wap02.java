import java.util.*;
public class random_wap02 {
    public static void main(String args[])
    {
          Scanner in = new Scanner(System.in);
          int a = in.nextInt();
          int b=a;
          int sum = 0;
          while(b>0)
          {
            sum=sum + b%10;
            b=b/10;
          }
         System.out.println((a % sum == 0) ? "Yes its niven" : "No its not");
    }
}
