import java.util.*;
public class recursed_fibonacci {
    static int fib(int n)
        {
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fib(n-1) + fib(n-2);
        };

        }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for(int i = 0;i<a;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }    
}
