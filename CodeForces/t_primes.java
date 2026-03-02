import java.util.*;
public class t_primes
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a;
        boolean[] primes = new boolean[1000001];
        Arrays.fill(primes, true);
        primes[0]=primes[1]=false;
        for(int i=2;i<=1000;i++)
        {
            if(primes[i])
            {
                for(int j=i*i;j<=1000000;j+=i)
                primes[j]=false;
            }
        }
        while(n-->0)
        {
            a=in.nextLong();
            long sqrt=(long)Math.sqrt(a);
            if(sqrt*sqrt==a)
            System.out.println((primes[(int)sqrt]) ? "YES" :"NO");
            else System.out.println("NO");
        }
    }
}