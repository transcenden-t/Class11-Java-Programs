/*
Program: To check wether the number is a Palindrome number or not
*/
import java.util.*;
public class Palindrome {
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
        int temp = n;
int rev = 0;
        while (temp > 0) {
    int digit = temp % 10;
    rev = rev * 10 + digit;
    temp = temp / 10;
        }
        System.out.println((rev==n) ? "yes" : "No");
    }
    
}
