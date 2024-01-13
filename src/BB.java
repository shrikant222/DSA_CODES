import java.util.Arrays;

public class BB {
    public static void bin(int num, int i, int[]arr){
        if(num<=0){return;}
        arr[i]=num%2;
        bin(num/2,i+1,arr);
    }

    public static void main(String[] args) {
        int [] arr= new int[10];
        bin(4,0,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length-1-i]);
        }

    }
}
