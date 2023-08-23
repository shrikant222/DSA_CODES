package LeetQutions;

public class LEET33 {


    public static void main(String[] args) {

        int[] arr = {  3, 1};
        System.out.println(pivot(arr));
        System.out.println(search(arr,1));
        int t = 2;
    }

    public static int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if (pivot == -1) {
            // just do normal binary search
            return binary(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }

        else if (target >= nums[0]) {
            return binary(nums, target, 0, pivot - 1);
        }

        return binary(nums, target, pivot + 1, nums.length - 1);



    }

    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (mid > start &&arr[mid] < arr[mid - 1] ) {
                return mid-1;
            }
         else if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
          else if (arr[mid] <=arr[start]) {
               end = mid - 1;
            }
            else  { start = mid + 1;


            }


        }
        return -1;

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
