package Arrays.kk;

import java.util.ArrayList;
import java.util.Arrays;
public class AEXP1 {
    public static int findNumbers(int[] nums)
    {
        int evenNum=0;

        for (int i = 0; i <nums.length ; i++)
        {
            int num=nums[i];
            String str= String.valueOf(nums[i]);
            if(str.length()%2==0) evenNum++;


        }
        return evenNum;
    }


    public static void main(String[] args) {
        int[] gain = {12,20,233,7896};
//        System.out.println(Arrays.toString(gain));
        System.out.println(findNumbers(gain));
    }

}