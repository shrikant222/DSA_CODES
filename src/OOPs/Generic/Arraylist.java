package OOPs.Generic;

import java.util.ArrayList;
import java.util.Arrays;

class Arraylist_Generic1<T> {

   private int size;
   private T[] data;
    public Arraylist_Generic1() {

        int fix_size = 10;
         this.data= (T[]) new Object[fix_size];
    }


    public void add(T num){
    if(isfull()){
        resize();
    }
    data[size++]= (T) num;
    }

    private boolean isfull() {
        return size==data.length;
    }

    private void resize() {
        Object []temp = new Object[size*2];
        for (int i = 0; i < size; i++) {
            temp[i]=data[i];
        }
        this.data= (T[]) (temp);
    }
    private Object get(int i) {
        return  data[i];
    }

    @Override
    public String toString() {
        return "Arraylist_Generic1{" +
                "size=" + size +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public static void main(String[] args) {
        Arraylist_Generic1<Integer> list1 = new Arraylist_Generic1<>();
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);
        list1.add(10);list1.add(10);list1.add(10);
        list1.add(10);list1.add(10);list1.add(100);
        list1.add(10);list1.add(10);list1.add(10);
        System.out.println(list1.get(10));


        System.out.println(list1);
    }
}