import java.util.*;
import java.io.*;
import java.math.BigDecimal;

class AA{
    public static void main(String[] args) {
        int[]arr={5,4,6,3,2,1};
        int []ans=mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergeSort(int[]arr){
        if(arr.length==1) return arr;
        int mid =arr.length/2;
        int[]left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);


    }

    public static int[]merge(int[]left,int[]right) {
        int t, l, r;

        t = l = r = 0;
        int[] mix = new int[left.length + right.length];
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                mix[t++] = left[l++];
            } else {
                mix[t++] = right[r++];
            }

        }
        while (l < left.length) {
            mix[t++] = left[l++];

        }
        while (r< right.length) {
            mix[t] = right[r];
            t++;
            r++;
        }
        return mix;
    }
}