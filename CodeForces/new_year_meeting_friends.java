    import java.util.*;
    public class new_year_meeting_friends
    {
        public static void main(String args[])
        {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            System.out.println(Math.max(x,Math.max(y,z))-Math.min(x,Math.min(y,z)));
        }
    }