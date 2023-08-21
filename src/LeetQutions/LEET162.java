package LeetQutions;

public class LEET162 {

        public static int binary(int[]arr){
            int start =0;
            int end = arr.length-1;

            while(end>start){
                int mid =start+(end-start)/2;

                if(arr[mid]>arr[mid+1]){
                    // we are in the dec part of array so this may be the possible ans
                    //but to check the left , we end is !=mid-1;
                    end=mid;
                }
                else {
                    // we are in asc part of array
                    start=mid+1;
                    //arr[mid]<arr[mid+1]
                    // beacause of that we know that mid+1 ele > mid ele
                }

            }
            // in the end, start == end and pointing to the largest number because of the 2 checks above
            // start and end are always trying to find max element in the above 2 checks
            // hence, when they are pointing to just one element, that is the max one because that is what the checks say
            // more elaboration: at every point of time for start and end, they have the best possible answer till that time
            // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
            return start; // or return end as both are =
        }


        public static void main(String[] args) {

            int[] arr = {1,2,1,3,5,6,4};
            System.out.println(binary(arr));
        }




    }


