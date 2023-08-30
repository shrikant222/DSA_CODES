package Sorting.Selction;

import java.util.Arrays;

import static Sorting.Selction.Selection_Sort.swap;

class Selction_MAX{
    public static void main(String [] args){
        int[] arr = {3,  1,5,4,0,-22,2};
        sort(arr);
         System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr)
    {

        for (int i =0; i < arr.length ; i++)
        {
            int last= arr.length-i-1;
            int max= 0;
            for (int j = 1; j <=last; j++)
            {
             if(arr[j]>arr[max])
             {
                 max=j;
             }
            }
            if(max!=last) {
                int temp = arr[last];
                arr[last] = arr[max];
                arr[max] = temp;
            }
        }






    }

        }






