import java.util.Scanner;
public class even_odds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k = in.nextLong();
        long mid = (n%2==0) ? n/2 : (n+1)/2;
        if(k<=mid)
        System.out.println(1+(k-1)*2);
        else
        System.out.println(2+((k-mid)-1)*2);
    }
}