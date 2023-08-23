package BInarySreachQutions;

 class Bit {
    static int sreach(int [] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean tORf=arr[0] < arr[end];


            while (start <= end) {
                int mid = start + (end - start) / 2;

                if(arr[mid]==target){return mid;}

                if(tORf)
                {

                    if (arr[mid] > target) {
                        end = mid - 1;
                    }
                    else {start = mid + 1;}
                }
                else
                {
                    if (arr[mid] > target)
                    {
                        start = mid + 1;
                    }
                    else
                    {
                        end = mid - 1;
                    }
                }

            }
            return -1;
    }



    public static void main(String[] args) {
        int t=0;
        int []arr={100,90,80,70,60,50,40,30,20,10};
        int [] arr1={10,20,30,40,50,60,70,90,100};

        System.out.println( sreach(arr,12));
         System.out.println( sreach(arr1,10));

    }
    }





