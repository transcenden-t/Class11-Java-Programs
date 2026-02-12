import java.util.*;
public class recursive_armstrong {
    int n,l;
    public recursive_armstrong(int xxx)//constructor
    {
        n=xxx;//67
        l = ("" + n).length();
    }
    int sum_pow(int n)//returns the sum of each digit raised to the power of length of the number
    {
        if(n<=9)
            return (int)Math.pow(n, l);
        else 
            return (int)Math.pow((n%10) , l) + sum_pow(n/10);
    }
    void isArmstrong()//to display
    {
        System.out.println((n == sum_pow(n)) ? "Yes" : "No");
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        recursive_armstrong obj = new recursive_armstrong(x);
        obj.isArmstrong();
    } 
}