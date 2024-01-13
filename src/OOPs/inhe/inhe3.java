package OOPs.inhe;

public class inhe3 {
    public static void main(String[] args) {
//        child ref = new parent(); not allowed child class may have
//        additional attributes or methods that the parent class does not have
//        ref.hello();
//        ref.hello1();
        parent r = new child(12);
        r.hello();
       parent r1 = new parent(12);
       r1.hello();
    }
}
class parent{
    public parent(int one) {
    }

    public static void hello1(){
        System.out.println("hello1");
    }
    public void hello2(){
        System.out.println("hello2");
    }
    public void hello(){
        System.out.println("hello");
    }
}
class child extends parent{
    public child(int one) {
        super(one);
        super.hello1();
    }

    public void hello(){
        System.out.println("hello from child");
    }
    public  void hellochild(){
        System.out.println("hello1 from child");
    }
}