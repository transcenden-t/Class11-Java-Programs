import java.util.*;
public class soldier_and_bananas
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        long k=in.nextLong();
        long n=in.nextLong();
        long w=in.nextLong();
        long tp = k * w * (w + 1) / 2;
        System.out.println((tp>n) ? tp-n : 0);
    }
}