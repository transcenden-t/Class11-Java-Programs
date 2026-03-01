import java.util.Scanner;
public class Drinks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        double nn=n;
        double s=0;
        while(n-->0)
        {
            s=s+in.nextDouble();
        }
        System.out.println((s/(nn*100))*100);
    }
}