package Arrays.kk;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
//A resizeable Array
    // in an array list we can store objects(wrapper class) (String , Integer, Boolean , Double, character) not a primitive types( int , boolean, double,char)

    public static void main(String[] args) {
        int [] arr = new int[10];
        List<String> one= new ArrayList<String>();

        ArrayList<Boolean> two= new ArrayList<>();
        ArrayList<Integer> three= new ArrayList<>();
        ArrayList<Boolean> four= new ArrayList<>();
        ArrayList<Double> five= new ArrayList<>();
        ArrayList<Character> six= new ArrayList<>();


        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder Sb = new StringBuilder();
        String s="jjjj";
        Sb.append(s.charAt(0));


        //Add() method
        one.add("hello");
        one.add("two");
        one.add("three");
        System.out.println(one.contains("two"));
        System.out.println(one);
        one.add(0,"newtwo");
        System.out.println(one);
        System.out.println( one.isEmpty());
        System.out.println(one.get(0));

        //get() method
        //set() method
        one.set(0,"zero");// change newtwo to zero;
//       // 0 ref to ->newtwo
        // now ref to-> zero    // now newtwo does not have an ref variable so object removed from memory by garbage collector
        one.remove("zeo");
        System.out.println(one);

        System.out.println(one.size());
        one.clear();        System.out.println(one.size());





    }
}
