package BInarySreachQutions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leet34 {
    public static int[] searchRange(int[] nums, int target) {

        int [] arr={-1,-1};
        arr[0] =value(nums,target,true);

        if(arr[0]!=-1) {
            arr[1]= value(nums, target, false);
        }


        return arr;

    }

    public static int value(int[] nums, int target, boolean b){
        int ans =-1;
        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if (nums[mid]>target) {
                end =mid-1;
            }
            else if (nums[mid]<target) {
                start=mid+1;
            }
            else {
                ans =mid;
                if (b)
                {end = mid - 1;
                }
                else {start = mid + 1;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,5,7,7,7,8,8};
        System.out.println(Arrays.toString(searchRange(arr,7)));
    }


}