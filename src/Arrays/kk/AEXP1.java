package Arrays.kk;
public class AEXP1 {
    public static int findNumbers(int[] nums)
    {
        int evenNum=0;

        for (int i = 0; i <nums.length ; i++)
        {
            int l= String.valueOf(nums[i]).length();
            if(l%2==0) evenNum++;


        }
        return evenNum;
    }


    public static void main(String[] args) {
        int[] gain = {12,20,233,7896};
        System.out.println(findNumbers(gain));
    }

}