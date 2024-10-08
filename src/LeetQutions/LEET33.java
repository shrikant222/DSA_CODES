package LeetQutions;

public class LEET33 {


    public static void main(String[] args) {

        int[] arr = {  10,12,13,2,5,6,8,9};
        System.out.println(pivot(arr));
        System.out.println(search(arr,2));
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
//    public int search(int[] nums, int target)  {
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left <= right) {
//            int mid = left + (right - left) / 2;
//
//            if (nums[mid] == target) {
//                return mid;
//            }
//
//            if (nums[left] <= nums[mid]) {
//                if (nums[left] <= target && target < nums[mid]) {
//                    right = mid - 1;
//                } else {
//                    left = mid + 1;
//                }
//            } else {
//                if (nums[mid] < target && target <= nums[right]) {
//                    left = mid + 1;
//                } else {
//                    right = mid - 1;
//                }
//            }
//        }
//
//        return -1;
//    }

    public static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (mid > 0 &&arr[mid] < arr[mid - 1] ) {
                return mid-1;
            }
         else if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            }
          else if (arr[mid] <arr[start]) {
                end=mid-1;
            }
            else  {
             start=mid+1;

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
