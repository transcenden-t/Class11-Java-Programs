//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.*;
class twosum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your range for the num array");
        int r = in.nextInt();
        int[] nums = new int[r];
        System.out.println("Enter your target");
        int target = in.nextInt();
        int i,j=0;
        boolean found=false;
        System.out.println("Enter nums");
        for(i=0;i<nums.length;i++)
        {
            nums[i]=in.nextInt();
        }
        for( i=0;i<nums.length;i++)
        {
            for(j = i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                found=true;break;
                }
            }
            if(found)
            break;
        }
        if(found)
        System.out.println("["+i+","+j+"]");
    }
}