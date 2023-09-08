package Recursion.Arrays;

public class RotatedBS {
 public int search(int[] nums, int target) {
  return RBS(nums, target,0, nums.length-1);
 }
 public static int RBS(int[]arr, int taget, int start, int end){
  if(start>end){
   return -1;
  }
  int mid =start+(end-start)/2;
  if(arr[mid]==taget){
   return mid;
  }
  if(arr[start]<=arr[mid])
  {
   if(arr[start]<=taget&&taget<=arr[mid]){
    return RBS(arr,  taget,start,mid-1);
   }
   else{
    return RBS(arr, taget,mid+1,end);
   }
  }
  else{
   if(arr[mid]<=taget&&taget<=arr[end]){
    return RBS(arr, taget,mid+1,end);
   }
   else{
    return RBS(arr,  taget,start,mid-1);
   }
  }
 }

 public static void main(String[] args) {
  int []arr={5,5,6,6,6,7,8,1,2,3,4,4,4};
  System.out.println(RBS(arr,3,0, arr.length-1));
 }


}
