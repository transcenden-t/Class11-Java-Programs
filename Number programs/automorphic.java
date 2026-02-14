/*
Program: To check wether the number is a Automorphic Number
*/
import java.util.*;
public class automorphic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int t=a;
        int b=a*a;
        int s = 0;
       while(t>0)
       {
        s++;
        t=t/10;
       }
       System.out.println((b%Math.pow(10, s)==a) ? "Yes" : "No");
    }
}
