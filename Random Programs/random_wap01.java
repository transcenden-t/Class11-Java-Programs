//WAP a program to input three different single digit numbers between 1 and 9 both inclusive.
// Display the greatest and smallest 3 digit number.
import java.util.*;
public class random_wap01 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Validation
        if (a < 1 || a > 9 || b < 1 || b > 9 || c < 1 || c > 9) {
            System.out.println("All numbers must be between 1 and 9.");
            return;
        }

        // Find max and min
        int max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        int min = (a < b && a < c) ? a : (b < a && b < c) ? b : c;

        // Find middle
        int middle = (a + b + c) - max - min;

        int gn = max * 100 + middle * 10 + min;
        int sn = min * 100 + middle * 10 + max;

        System.out.println("Greatest = " + gn);
        System.out.println("Smallest = " + sn);
    }
}
