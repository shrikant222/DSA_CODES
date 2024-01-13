package BInarySreachQutions;

public class InfinityArray {
    // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        System.out.println(ans(arr, 11));
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(arr[end]<target){
            start=end+1;
            end =end+end*2;
        }
        return sreach(arr,target,start,end);
    }

    public static int sreach(int[] arr, int target, int start, int end) {


        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }


        }
        return -1;

    }
}

// by KK
//class InfiniteArray {
//    public static void main(String[] args) {
//        int[] arr = {3, 5, 7, 9, 10, 90,
//                100, 130, 140, 160, 170};
//        int target = 160;
//        System.out.println(ans(arr, target));
//    }
//    static int ans(int[] arr, int target) {
//        // first find the range
//        // first start with a box of size 2
//        int start = 0;
//        int end = 1;
//
//        // condition for the target to lie in the range
//        while (target > arr[end]) {
//            int temp = end + 1; // this is my new start
//            // double the box value
//            // end = previous end + sizeofbox*2
//            end = end + (end - start + 1) * 2;
//            start = temp;
//        }
//        return binarySearch(arr, target, start, end);
//
//    }
//    static int binarySearch(int[] arr, int target, int start, int end) {
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                // ans found
//                return mid;
//            }
//        }
//        return -1;
//    }
//}