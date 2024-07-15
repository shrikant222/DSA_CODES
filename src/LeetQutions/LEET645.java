package LeetQutions;

import java.util.Arrays;

class LEET645 {
    public static int[] findErrorNums(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(correct<arr.length&&arr[correct]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else i++;
        }
        int [] ans = new int[2];
        for (int j = 0; j < arr.length ; j++) {
        if(arr[j]!=j+1){
            ans[0]=arr[j];
            ans[1]=j+1;
            break;
        }
        }
        return ans;
    }
  static int missingNumber(int array[]) {
        int i=0;
        while(i<array.length){
            int corr=array[i]-1;
            if(corr<array.length&&array[corr]!=array[i]){
                int temp=array[corr];
                array[corr]=array[i];
                array[i]=temp;
            }
            else{
                i++;
            }
        }

        for(int j=0;j<array.length;j++){
            if(array[j]!=j+1){
                return j+1;
            }
        }
        return array.length+1;
    }
    public static void main(String[] args) {
        //starting from 0 therefore index==element
        int []arr={2,1,4,2,6,5};

        System.out.println(missingNumber(arr));
        System.out.println(Arrays.toString(arr));
    }
}