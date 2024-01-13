package Sorting.Selction;


import java.util.Arrays;

public class common {
    public static void main(String[] args) {
        int[] arr =  {2,5,3,1,4};
        System.out.println(arr.length);
//        sort_Selection_Max(arr);
//        sort_insrtion(arr);
//        sort_Bubble(arr);
        sort_Selection_min(arr);

        System.out.println(Arrays.toString(arr));

    }

    //By the Insertion sorting;
    static void sort_insrtion(int[] arr)
    {
        for (int i = 0; i <arr.length-1 ; i++)
        {
            for (int j = i+1; j >0 ; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    sawp(arr,j,j-1);
                }
                else {break;}

            }

        }
    }
    //by bubble sorting
    static void sort_Bubble(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    sawp(arr,j,j-1);
                }

            }
        }
    }

    //By selection sorting, and min
   private static void sort_Selection_min(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++)
        {
            int indexOfMin=i;

            for (int j = i+1; j < arr.length ; j++)
            {
                if(arr[indexOfMin]>arr[j])
                {
                    indexOfMin=j;
                }
            }
            sawp(arr,i,indexOfMin);

        }
    }


    //By selection sorting, max
    static void sort_Selection_Max(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            int last= arr.length-i-1;
            int max=0;
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            sawp(arr,max,last);
        }
    }
    private static void sawp(int[] arr, int i, int indexOfMin)
    {
        int temp=arr[i];
        arr[i]=arr[indexOfMin];
        arr[indexOfMin]=temp;
    }


}

