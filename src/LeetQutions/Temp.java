package LeetQutions;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3};
        System.out.println(singleNonDuplicate(nums));
    }
        public static int singleNonDuplicate(int[] nums) {

         int start=0, end=nums.length-1;
         while(start<end){

             int mid=start+(end-start)/2;
             if(end>mid&&start<mid-1&&nums[mid]>nums[mid-1]&&nums[mid]<nums[mid+1]){
                 return nums[mid];
             }

             if(mid%2==0){
                 if(nums[mid]==nums[mid+1]){
                     start=mid+1;
                 }
                 else{
                     end=mid-1;
                 }

             }
             else{
                 if(nums[mid]==nums[mid-1]){
                     start=mid+1;
                 }
                 else{
                     end=mid;
                 }

             }


        }
         return nums[start];

    }



}
