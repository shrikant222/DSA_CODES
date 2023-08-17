package Sorting.Selction;

import java.util.Arrays;

public class Selection_Sort {

    public static void main(String[] args)
    {int[] arr={3,5,1,4,2};
        Ssort(arr);
        System.out.println(Arrays.toString(arr));

    }

static int maxindex(int[] arr,int start , int last_index){
        int max=start;
    for (int i = start; i <=last_index ; i++) {
        if (arr[max]<arr[i]){
            max=i;
        }

    }
    return max;
}


    static void swap(int[] arr,int firest, int second ){

        int temp=arr[firest];
        arr[firest]=arr[second];
        arr[second]=temp;
    }


    static void Ssort(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the max item in the reamining array and swap with correct index.
           int last_index=arr.length-i-1;
           int start=0;
           int max_index=maxindex(arr,start , last_index);

           swap(arr,max_index,last_index);

        }

    }
}
