package collection;

import java.util.ArrayList;
import java.util.*;

interface list {

    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ArrayList arr = new ArrayList();
        arr.add("1");
        arr.add(12);

            System.out.println(arr);


        Vector<Integer> v = new Vector<>(arr);
        v.add(0);
        v.add(20);
        System.out.println(v);
    }
}

