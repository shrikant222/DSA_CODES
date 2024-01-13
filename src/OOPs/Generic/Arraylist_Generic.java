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

    @Override
    public String toString() {
        return "Arraylist_Generic{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void add(T num)
    {   if(isfull())
    {
           resize();
    }
          data[size++]=num;
    }
    public T get(int index)
    {
        return (T)data[index];
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    private void resize() {
        Object[] temp = new Object[size*2];
        if (size >= 0) System.arraycopy(data, 0, temp, 0, size);
        data=temp;
    }

    private boolean isfull() {
        return data.length==size;
    }

    public static void main(String[] args) {
        Arraylist_Generic<String> list = new Arraylist_Generic<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        System.out.println(list);

    }


}
