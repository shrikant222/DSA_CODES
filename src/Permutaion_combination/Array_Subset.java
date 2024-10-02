package Permutaion_combination;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Array_Subset {
    public static void main(String[] args) {int[][] matrix = {
            {1,3,5,7},{10,11,16,20},{23,30,34,60}
    };
        System.out.println(m(matrix,3));
    }

    public static List<List<Integer>> permutaion(int[]arr) {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr) {
            int n=outer.size();
            for(int j=0;j<n;j++) {
            List<Integer> internal=new ArrayList<>(outer.get(j));
            internal.add(num);
            outer.add(internal);
            }
        }

        return outer;

    }
    public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> out=new ArrayList<>();
    if(nums.length==0)return out;
    if(nums.length==1) {
        out.add(Arrays.asList(nums[0]));
    }
    if(nums.length==2){
        out.add(Arrays.asList(nums[0],nums[1]));
        out.add(Arrays.asList(nums[1],nums[0]));
        return out;
    }

     int p=0;
        for (int i = 0; i < nums.length; i++) {
            List<Integer>o=new ArrayList<>();
            List<Integer>r=new ArrayList<>();
            for (int j=0;j< nums.length;j++){
                o.add(nums[(j+p)% nums.length]);
                r.addFirst(nums[((j+p)% nums.length)]);
            }
            p++;
            out.add(o);
            out.add(r);
        }
    return out;
    }

    public static boolean m(int[][]matrix, int k){
        return findIn(matrix, k);
    }

    private static boolean findIn(int[][] matrix, int k) {
        int s=0;
        int e=matrix.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(matrix[mid][0]<=k &&matrix[mid][matrix[0].length-1]>=k ){
              return BS(matrix,k,mid);
            }
            else if(matrix[mid][0]<k)s=mid+1;
            else if(matrix[mid][0]>k) e=mid-1;
        }
        return false;
    }
    public static boolean BS(int[][] matrix, int k, int row){
        int s=0;
        int e=matrix[0].length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(matrix[row][mid]==k)return true;
            else if(matrix[row][mid]<k) s=mid+1;
            else  e=mid-1;
        }
        return false;
    }

}
