package OOPs.Generic;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_Generic<T> {
    private Object[] data;
    private int size=0;
    public int size(){
        return size;
    }
    public Arraylist_Generic()
    {
        int default_size = 10;
        this.data = new Object[default_size];
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
        Arraylist_Generic<String> list = new Arraylist_Generic<>();
        ArrayList<String> a = new ArrayList<>();

list.add("hello");
list.add("world");

        list.getAll();

    }


}
