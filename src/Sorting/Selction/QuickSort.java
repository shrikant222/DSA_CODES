package Sorting.Selction;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        quicksort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[]arr, int low,int high){
        if(low>=high)return;

        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while(start<=end){
            while(arr[start]<pivot){
                    start++;
            }
            while(arr[end]>pivot){
                end--;
            }

            if(start<=end){
                int temp=arr[start];
                arr[start++]=arr[end];
                arr[end--]=temp;
            }
        }
        quicksort(arr,low,end);
        quicksort(arr,start,high);
    }

    public static void quicksort1(int []arr,int low,int high){
        if(high<=low)return;
        int pivot=arr[high];
        int i=low-1;

        for (int j = low; j <high; j++)
        {
            if(pivot>arr[j])
            {
                i++;
                swap(arr,i,j);


            }


        }
        swap(arr,i+1,high);
        quicksort1(arr,low,i);
        quicksort1(arr,i+1,high);

    }

    public static void swap(int[]arr,int i, int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
