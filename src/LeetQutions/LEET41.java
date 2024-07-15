package LeetQutions;

import java.util.Arrays;

public class LEET41 {
    public int firstMissingPositive(int[] arr) {


        int i=0;
        while(i<arr.length){
            //starting from 0 therefore index==element
            // starting from 1 then correct=arr[i]-1;
            int correct=arr[i]-1;
            if(correct<arr.length && arr[i]>0 && arr[correct]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else i++;
        }
        for (int j = 0; j < arr.length ; j++) {
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int []arr={7,8,9,11,12};
        LEET41 obj=new LEET41();
        System.out.println(obj.firstMissingPositive(arr));
        System.out.println(Arrays.toString(arr));
    }


}
