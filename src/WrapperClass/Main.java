package WrapperClass;

public class Main {
    public static void main(String[] args) {
      int[] nums= {8,1,2,2,3};

        System.out.println( smallerNumbersThanCurrent(nums));
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