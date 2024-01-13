package BInarySreachQutions;

public class Rotated_Arr_Dublicate {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        System.out.println(pivot(arr)+1);

    }
    public static int pivot(int [] arr){
        int start=0, end=arr.length-1;

        while(end>=start) {
            int mid = (start + end) / 2;

            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            else if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
          if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
              if(arr[start]>arr[start+1]){
                  return start;
              } start++;
             if(arr[end]<arr[end-1]){
                  return end-1;
              } end++;
          } else if (arr[start]<arr[mid]||arr[start]==arr[mid]&&arr[mid]>arr[end]) {
              start = mid+1;
          }
          else {
              end=mid-1;
          }
        }

        return -1;
    }

    public static int search(int[] arr, int target){
        int p= pivot(arr);
        if(arr[p]==target) return p;
        else if (binary(arr,target,0,p-1)!=-1){
            return binary(arr,target,0,p-1);
        }
        else return binary (arr, target, p+1, arr.length);


    }

    public static int binary(int[]arr,int target, int start, int end){


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
}
