package OOPs.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wildcard<T extends Integer> {  //wildcard
    private Object[] data;
    private int size=0;
    public int size(){
        return size;
    }
    public Wildcard()
    {
        int default_size = 10;
        this.data = new Object[default_size];
    }
//    public static void getList(List<Number> list){
//        //here we can pass only Number but not subclass
//    }
    public static void getList(List<? extends  Number>























                                       list)
    {
    //here we can pass  not only Number but subclass also
        System.out.println(list);
    }
    public void add(T num)
    {   if(isfull())
    {
        resize();
    }
        data[size++]=num;
    }
    public void getAll()
    {
        for (int i = 0; i <size; i++)
        {
            System.out.println(data[i]);
        }
    }

    private void resize() {
        Object[] temp = new Object[size*2];
        if (size >= 0) System.arraycopy(data, 0, temp, 0, size);
        data=temp;
    }

    private boolean isfull() {
        return data.length==size;
    }
    private Object get(int i) {
        return  data[i];
    }
    @Override
    public String toString() {
        return "Arraylist={" +
                "data=" + Arrays.toString(data) +
                ", size=" +  size+
                '}';
    }

    public static void main(String[] args) {
        Wildcard<Integer> list = new Wildcard<>();
        ArrayList<Integer> a = new ArrayList<>();
//
        list.add(10);
//
//        list.getAll();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        getList(integerList); // Valid, passing a list of Integers
        getList(doubleList); // Valid, passing a list of Doubles

//        getList((List<? extends Number>) list);

    }
}
