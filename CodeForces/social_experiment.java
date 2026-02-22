import java.util.*;
public class social_experiment {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int tc=in.nextInt();
        while(tc-- >0)
        {
            int n=in.nextInt();
            if(n==2 || n==3)
                System.out.println(n);
            else if(n%2==0) 
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}
