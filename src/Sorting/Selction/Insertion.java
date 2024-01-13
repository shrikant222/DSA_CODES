package Sorting.Selction;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr =  {2,5,3,1,4};
        sorti(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void sorti(int[] arr)
     {
        for (int i = 0; i <arr.length-1 ; i++)
        {
            for (int j = i+1; j >0 ; j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else {break;}

            }

        }
    }

}
