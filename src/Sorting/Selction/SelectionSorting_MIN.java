package Sorting.Selction;

import java.util.Arrays;



 class SelectionSorting {
    static void sort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
         int min=minIndex(arr,i);
         swapp(arr,i,min);
        }
    }

    private static void swapp(int[] arr, int first, int min) {
        int temp=arr[first];
        arr[first]=arr[min];
        arr[min]=temp;
    }

    private static int minIndex(int[] arr,int first) {
        int min=first;
        for (int j =first+1 ; j < arr.length ; j++) {
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5,-1,0,32,-52,0};
sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
