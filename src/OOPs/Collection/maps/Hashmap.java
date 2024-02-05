package OOPs.Collection.maps;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hmm= new HashMap<>();
        AbstractMap<Integer,String> hm = new HashMap<>();
//        hm.put(10,"a");
        hm.put(20,"b");
        hm.put(30,"c");
        hm.put(40,"d");
        hm.put(10,"e");
        ArrayList<Integer> aa=new ArrayList<>();
        String sachin = "Sachin";

        TreeMap<Integer,String> ab = new TreeMap<>();
        ab.put(10,"shri");
        ab.put(1,"shri");
        ab.put(25,"shri");
        System.out.println(ab);


    }
}
