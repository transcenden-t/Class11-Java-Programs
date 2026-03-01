import java.util.Scanner;
public class calculating_function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        System.out.println((long)(Math.pow(-1, n)*(2 * n + 1)-1)/4);
    }
}   