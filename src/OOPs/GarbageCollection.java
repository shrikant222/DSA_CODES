package OOPs;

import OOPs.Collection.ex1;


public class GarbageCollection {
    String name;
    GarbageCollection(String name){
        this.name=name;
    }


    protected void finalize() throws Throwable{
        System.out.println("Done!!!");
    }
}
class mm extends ex1 {
    public static void main(String[] args) {
//    GarbageCollection obj= new GarbageCollection("NO name00");
//        System.out.println(obj.name);
//        for (int i = 0; i < 1000000000; i++) {
//            obj=new GarbageCollection("na");
//        print1();
        }
    }

