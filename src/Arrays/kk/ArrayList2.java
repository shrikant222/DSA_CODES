package Arrays.kk;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
//A resizeable Array
    // in an array list we can store objects(wrapper class) (String , Integer, Boolean , Double, character) not a primitive types( int , boolean, double,char)

    public static void main(String[] args) {
        int [] arr = new int[10];
        List<String> one= new ArrayList<>();


        ArrayList<Integer> o= new ArrayList<>();


        o.add(1);
        o.add(2);
        o.add(3);
        o
                .add(4);

        System.out.println(o);

        int temp=o.get(0);
        o.set(0,o.get(1));
        o.set(1,temp);

        System.out.println(o);





    }
}
