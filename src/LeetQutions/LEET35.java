package LeetQutions;

class LEET35 {
    public static int searchInsert(int[] arr, int target) {
      int start =0;
      int end= arr.length-1;
      while(start<= end){
          int mid=start+(end-start)/2;
          if(arr[mid]==target){
              return mid;
          }
         else if(arr[mid]>target){
              end =mid-1;
          }
          else{
              start=mid+1;
          }
      }
        System.gc();
      return start;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        System.out.println( searchInsert(arr,7));
    }
}