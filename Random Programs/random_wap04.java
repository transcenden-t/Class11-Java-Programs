// to find S = 1/2 - 2/3 + 3/4 - 4/5 ........ to n
import java.util.*;
public class random_wap04 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your range");
        int n = in.nextInt();
        double i;
        double s = 0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            s = s - i/(i+1);
            else
            s = s + i/(i+1);
        }
        System.out.println(s);
    }
}
