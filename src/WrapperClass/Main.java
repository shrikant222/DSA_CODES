package WrapperClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      double E =Math.E;
        System.out.println(E);
        double x=Math.pow(2,3);
        double y=Math.sqrt(16);
        System.out.println(x);
        System.out.println(y);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] arr= new int[nums.length];

        for(int j=0; j<nums.length;j++) {
            int count=0;
            for (int i = 0; i < nums.length; i++) {

                int num = nums[i];
                if (num > nums[i]) {
                    count++;
                }
            }
            System.out.println(count);
            int i = 0;
            i++;
            arr[i] = count;
        }

        return arr;
    }
}

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int max=nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[j]>max){
                    ans[j]++;
                }
            }

        }
        return ans;
    }
}