package Arrays.kk;

import java.util.Arrays;

public class leet34 {
    public static   int[] searchRange(int[] nums, int target) {

        int [] ans ={-1,-1};
        int start = find(nums,target,true);
        int end = find(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public static int find(int[] nums, int target, boolean firstindex) {
        int ans = -1;
        int start =0;
        int end  =nums.length;
        while (end>=start){
            int mid = start+(end -start)/2;
            if(target<nums[mid]){
                end = mid-1;

            }
            else {
                start=mid+1;
            }
            ans = mid;
            if(firstindex){
                end = mid-1;
            }
            else {
                start=mid+1;
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        int [] nums={1,2,2,2,3,4,5};

        System.out.println(Arrays.toString(searchRange(nums, 2)));
    }
    }

