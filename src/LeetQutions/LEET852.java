//package LeetQutions;
//

package LeetQutions;

<<<<<<< Updated upstream
public class LEET852 {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(arr[peakIndexInMountainArray(arr)]);
    }
    public static int pivot(int[]arr){
        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(end>mid&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid&&arr[mid-1]>arr[mid]){
                return mid-1;
            }
            if(arr[mid]>=arr[start]){
                start=mid+1;
            }
            else {
                end =mid-1;
=======

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class LEET852
{
    public static int binary(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
            {
                return mid;
            } else if (arr[mid] > arr[mid + 1])
            {
                end = mid - 1;
            }
            else {
                start = mid + 1;
>>>>>>> Stashed changes
            }
        }
        return -1;
    }

    public static int peak(int []arr){
        int start=0, end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

<<<<<<< Updated upstream
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return end; // or return end as both are =
    }

    public static int peakIndexInMountainArray1(int[] arr)
    {

        int start =0;
        int end = arr.length-1;

        while(end>=start){
            int mid = start+(end -start)/2;
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
                return mid;
            }
            else if (arr[mid]>arr[mid+1]) {
                end=mid-1;
            }

            else{
                start=mid+1;
            }


        }
        return -1;

    }

}

// class LEET852 {
//    // linear search
//    //https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1025751065/
//    public static int binary(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (end >= start) {
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
//            {
//                return mid;
//            } else if (arr[mid] > arr[mid + 1])
//            {
//                end = mid - 1;
//
//            }
//            else {
//                start = mid + 1;
//            }
//        }
//        return -1;
=======
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 8, 15,5,2};
        System.out.println(binary(arr));
    }
}
//
//public class TRY {
//    public static int binary(int[]arr){
//        int start =0;
//        int end = arr.length-1;
//
//        while(end>start){
//            int mid =start+(end-start)/2;
//
//            if(arr[mid]>arr[mid+1]){
//                // we are in the dec part of array so this may be the possible ans
//                //but to check the left , we end is !=mid-1;
//                end=mid;
//            }
//            else {
//                // we are in asc part of array
//                start=mid+1;
//                //arr[mid]<arr[mid+1]
//                // beacause of that we know that mid+1 ele > mid ele
//            }
//
//        }
//        // in the end, start == end and pointing to the largest number because of the 2 checks above
//        // start and end are always trying to find max element in the above 2 checks
//        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
//        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
//        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
//        return start; // or return end as both are =
>>>>>>> Stashed changes
//    }
//
//
//    public static void main(String[] args) {
//
<<<<<<< Updated upstream
//
//        int [] arr = {0,2,1,0};
//        System.out.println(sreach(arr));
//        System.out.println(peakIndexInMountainArray(arr));
//    }
//
//// by own method
//        public static int own(int[] arr)
//        {
//
//            int start =0;
//            int end = arr.length-1;
//
//            while(end>=start){
//                int mid = start+(end -start)/2;
//                if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1]){
//                    return mid;
//                }
//                else if (arr[mid]>arr[mid+1]) {
//                    end=mid-1;
//                }
//
//                else{
//                    start=mid+1;
//                }
//
//
//            }
//            return -1;
//
//        }
//
//
//
//        public static int peakIndexInMountainArray(int[] arr) {
//            int start =0;
//            int end = arr.length-1;
//
//            while(end>start){
//                int mid =start+(end-start)/2;
//
//                if(arr[mid]>arr[mid+1]){
//                    end=mid;
//                }
//                else {
//                    start=mid+1;
//                }
//
//            }
//            return start;
//        }
//    }
//
//
//    }
//}
////
////public class TRY {
////    public static int binary(int[]arr){
////        int start =0;
////        int end = arr.length-1;
////
////        while(end>start){
////            int mid =start+(end-start)/2;
////
////            if(arr[mid]>arr[mid+1]){
////                // we are in the dec part of array so this may be the possible ans
////                //but to check the left , we end is !=mid-1;
////                end=mid;
////            }
////            else {
////                // we are in asc part of array
////                start=mid+1;
////                //arr[mid]<arr[mid+1]
////                // beacause of that we know that mid+1 ele > mid ele
////            }
////
////        }
////        // in the end, start == end and pointing to the largest number because of the 2 checks above
////        // start and end are always trying to find max element in the above 2 checks
////        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
////        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
////        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
////        return start; // or return end as both are =
////    }
////
////
////    public static void main(String[] args) {
////
////        int[] arr = {1,2,1,3,5,6,4};
////        System.out.println(binary(arr));
////    }
////
////
////
////
////}
//
//
////
////public class LEET852 {
////    public static int sreach(int []arr){
////        int ans =0;
////        for (int i = 0; i < arr.length; i++) {
////            if(arr[ans]<arr[ans+1]){
////                ans+=1;
////            }
////            else {
////                break;
////            }
////        }
////        return ans;
////    }
////
////
////    public static void main(String[] args) {
////
////        int [] arr = {0,2,1,0};
////        System.out.println(sreach(arr));
////    }
////
////
////
////
////}
//
//
//
//
//>>>>>>> Stashed changes
=======
//        int[] arr = {1,2,1,3,5,6,4};
//        System.out.println(binary(arr));
//    }
//
//
//
//
//}


//
//public class LEET852 {
//    public static int sreach(int []arr){
//        int ans =0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[ans]<arr[ans+1]){
//                ans+=1;
//            }
//            else {
//                break;
//            }
//        }
//        return ans;
//    }
//
//
//    public static void main(String[] args) {
//
//        int [] arr = {0,2,1,0};
//        System.out.println(sreach(arr));
//    }
//
//
//
//
//}




>>>>>>> Stashed changes
