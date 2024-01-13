package Recursion.Arrays;

import java.util.ArrayList;

public class Find_All_index {
//   static ArrayList<Integer> list = new ArrayList<>();
//    static void index(int []arr, int target,int index){
//        if(index==arr.length) return;
//        if(target==arr[index]) list.add(index);
//        index(arr,target,index+1);
//    }




//    static ArrayList<Integer> index1(int []arr, int target, int index, ArrayList<Integer> list1){
//        if(index==arr.length) return list1;
//        if(target==arr[index]) list1.add(index);
//        index1(arr,target,index+1,list1);
//        return list1;
//    }


    static ArrayList<Integer> index2(int []arr, int target, int index){
        ArrayList<Integer> list2 = new ArrayList<>();
        if(index==arr.length) return list2;
        if(target==arr[index])list2.add(index);
//        ArrayList<Integer> ansfromBelowCalls =index2(arr,target,index+1);
        list2.addAll(index2(arr,target,index+1));
        return list2;
    }

    public static void main(String[] args) {
        int []arr={1,8,2,8,5,8};
       ArrayList<Integer> ans= index2(arr,8,0);

            System.out.println(index2(arr,8,0));

    }

}
