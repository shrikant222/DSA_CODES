//package LeetQutions;
//
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//import static LeetQutions.Leet34.value;
//
//public class Leet744 {
//    public static int[] searchRange(int[] nums, int target) {
//
//        int[] arr = {-1, -1};
//        int first = value(nums, target, true);
//        int last = value(nums, target, false);
//        arr[0] = first;
//        arr[1] = last;
//
//        return arr;
//
//
//
//            public static int binary(int[] arr) {
//                int start = 0;
//                int end = arr.length - 1;
//
//                while (end > start) {
//                    int mid = start + (end - start) / 2;
//
//                    if (arr[mid] > arr[mid + 1]) {
//
//                        end = mid;
//                    } else {
//
//
//                        start = mid + 1;
//
//
//                        public static int value ( int[] nums, int target, boolean b){
//                            int ans = -1;
//                            int start = 0;
//                            int end = nums.length - 1;
//
//                            while (start <= end) {
//                                int mid = start + (end - start) / 2;
//
//                                if (nums[mid] > target) {
//                                    end = mid - 1;
//                                } else if (nums[mid] < target) {
//                                    start = mid + 1;
//                                } else {
//                                    ans = mid;
//                                    if (b) {
//                                        end = mid - 1;
//                                    } else {
//                                        start = mid + 1;
//                                    }
//                                }
//
//                            }
//                            return ans;
//                        }
//
//                    }
//
//                }
//
//                return start;
//            }
//        }
//    }





