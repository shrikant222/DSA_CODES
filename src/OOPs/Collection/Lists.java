package OOPs.Collection;

import Multi_Threading.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
//      parent a = child class
        ArrayList b = new ArrayList();
        a.add(10);
        System.out.println(a);
        int [] l = new int[5];
        for (int i = 0; i < 2; i++) {
            System.out.println(l[i]);
        };
    }
}
