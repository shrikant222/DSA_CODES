package AAATRY;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class BufferReader {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String h1=br.readLine();

        String[] h2=h1.split(" ");

        int[] arr= new int[6];
        int[] arr2= new int[6];
        for(int i=0;i<6;i++){
            arr[i]=Integer.parseInt(h2[i]);
        }
        for(int i=0;i<6;i++){
            arr2[i]=Integer.parseInt(h2[6+i]);
        }
        System.out.println(Arrays.toString(arr2));
    }
}