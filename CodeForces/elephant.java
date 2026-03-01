import java.util.Scanner;
public class elephant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        System.out.println(a%5==0 ? a/5 : a/5+1);
    }
}