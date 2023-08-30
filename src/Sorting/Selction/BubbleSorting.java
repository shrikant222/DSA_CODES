package Sorting.Selction;

import java.util.Arrays;

public class BubbleSorting {

    static int[]Buusort(int[] arr){
        // run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            // for each step max item will come at the last respective index.
            boolean swap =false;
            for(int j=0;j<arr.length-i-1;j++)
            {

                // swap if the item is samller than previous item
                if(arr[j+1]<arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap =true;
                }


            }
            if(!swap)
                break;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,-1,0,-3};

        System.out.println(Arrays.toString(Buusort(arr)));
        System.out.println();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
