package OOPs.AbstaractClass;

interface a{
    void add();
    default void sub(){
        System.out.println("sub");
    }

}
interface b extends a {
    int square(int n);
    @Override
    void add();
}

abstract  class c implements a,b{
  void prt(){
        System.out.println("hello from abstract class ");
    }
}

public class Interfaces extends c{
public void add(){
    System.out.println("1");
}

    @Override
    public int square(int n) {
        return 0;
    }
//public int square(int n){
//    System.out.println(n);
//    return n;
}
class d{
    public static void main(String[] args) {
        Interfaces  i = new Interfaces();
        i.add();
        i.prt();

    }
}

