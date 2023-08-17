package Sorting.Selction;

import java.util.Arrays;

 class SORTING {

    public static void main(String[] args) {
        int[] arr =  {2,5,3,1,4};
        sortIT(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void sortIT(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++)
        {
            int indexOfMin=i;

            for (int j = i+1; j < arr.length ; j++)
            {
                if(arr[indexOfMin]>arr[j])
                {indexOfMin=j;}
            }
            int temp=arr[i];
            arr[i]=arr[indexOfMin];
            arr[indexOfMin]=temp;
        }
    }


}
