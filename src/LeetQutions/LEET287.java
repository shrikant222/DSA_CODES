package LeetQutions;

import java.util.Arrays;
//https://leetcode.com/problems/find-the-duplicate-number/description/
public interface LEET287 {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int cor_inx = nums[i]-1;
            if (nums[cor_inx] != nums[i]) {
                int temp = nums[cor_inx];
                nums[cor_inx] = nums[i];
                nums[i] = temp;
            } else i++;
        }
        return nums[nums.length-1];
    }
    public static int findDuplicate2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int cor_inx = nums[i] - 1;
                if (nums[cor_inx] != nums[i]) {
                    int temp = nums[cor_inx];
                    nums[cor_inx] = nums[i];
                    nums[i] = temp;
                }
                else return nums[i];
            }
            else i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        //starting from 0 therefore index==element
        int []arr={1,3,3,4,2,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicate2(arr));
    }
}
