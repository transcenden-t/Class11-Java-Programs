import java.util.*;
public class new_year_string
{
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int tc=in.nextInt();
        while(tc-->0)
        {
            int n=in.nextInt();
            in.nextLine();
            String str=in.nextLine();
            System.out.println(str.contains("2025")? str.contains("2026") ? 0 : 1 : 0);
        }
    }
}