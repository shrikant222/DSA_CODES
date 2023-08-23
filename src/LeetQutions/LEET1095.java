package LeetQutions;

public class LEET1095 {
    //https://leetcode.com/problems/find-in-mountain-array/
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6,7,8,9,5,2,3,1,0};
        int target=3;
     if(Asc(arr,target)!=-1){
         System.out.println(Asc(arr,target));
     }
     else {

         System.out.println(Dsc(arr,target));

     }
    }

    public static int peak(int [] arr){
      int start =0,end = arr.length-1;
      while(start<end){
          int mid = start +(end-start)/2;
          if(arr[mid]>arr[mid+1]){
              end=mid;
          }
          else {
              start=mid+1;
          }
      }
        return end;
    }
    public static int Asc(int arr[], int target)
        {
            int start =0;
            int end = peak(arr);

            while(end>=start){
                int mid = start+(end -start)/2;
                if(arr[mid]>target){
                    end =mid-1;
                }
                else if (arr[mid]<target) {
                    start =mid+1;
                }

                else{
                    return mid;
                }
            }
            return -1;
        }
    public static int Dsc(int arr[], int target)
    {
        int start =peak(arr);
        int end =arr.length-1 ;

        while(end>=start){
            int mid = start+(end -start)/2;
            if(arr[mid]>target){
                start=mid+1;
            }
            else if (arr[mid]<target) {
                end =mid-1;
            }

            else{
                return mid;
            }


        }
        return -1;
    }



}
