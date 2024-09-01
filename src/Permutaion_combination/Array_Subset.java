package Permutaion_combination;

import java.util.ArrayList;
import java.util.List;

public class Array_Subset {
    public static void main(String[] args) {
      int []arr={1,2,3};
//        System.out.println(permutaion(arr));
      List<Integer> ll= new ArrayList<>();
      ll.add(1);
        List<Integer> lll= new ArrayList<>(ll.get(1));
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
}
