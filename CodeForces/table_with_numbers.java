import java.util.*;
public class table_with_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while (tc-- > 0) {
            int n = in.nextInt();
            int h = in.nextInt();
            int l = in.nextInt();
            int a,ch=0,cl=0;
            if(h<=l)
            {
                while(n-->0)
                {
                    a=in.nextInt();
                    ch=(a<=h) ? ch+1 : ch;
                    cl=(a<=l) ? cl+1 : cl;
                }
                // System.out.print(" "+ch+" "+cl+" "+h+" "+l);
                System.out.println(Math.min(ch,cl/2));
            }
            else if(l<=h)
            {
                while(n-->0)
                {
                    a=in.nextInt();
                    ch=(a<=h) ? ch+1 : ch;
                    cl=(a<=l) ? cl+1 : cl;
                }
                System.out.println(Math.min(ch/2,cl));
            }    
        }
    }
}
