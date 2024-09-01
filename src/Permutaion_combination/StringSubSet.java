package Permutaion_combination;

import java.util.ArrayList;

public class StringSubSet {
    public static void main(String[] args) {

        System.out.println(subSetList("abc",""));
    }

    public static void subSet(String input,String op){
        if(input.isEmpty()){
            System.out.println(op);
            return;
        }
        subSet(input.substring(1),op+input.charAt(0));
        subSet(input.substring(1),op);

    }

    public static ArrayList<String> subSetList(String input, String op){
        if(input.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(op);
            return list;
        }
        ArrayList<String>Right= subSetList(input.substring(1),op+input.charAt(0));
        ArrayList<String>left= subSetList(input.substring(1),op);
        left.addAll(Right);
        return left;





    }

}
