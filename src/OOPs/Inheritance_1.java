package OOPs;

public class Inheritance_1 {
    int a;
    private float b;
    public Inheritance_1(){
        System.out.println("hii");
    }

    public Inheritance_1(int a,float b) {
        super();
        this.a=a;
        this.b=b;
    }
    Inheritance_1(Inheritance_1 i){
        this.a=i.a;

    }

}
class Child extends Inheritance_1{
    int c;
    public Child(int a,float b,int c ) {
//        super(a,b);
        this.c=c;
         }



}
class  Child1 extends Child {
    int d;
    int c;
    public Child1(int a, float b, int c, int d) {

        super(a,b,c);
        this.c=d;
        super.c=c;
        System.out.println(this.c+" "+super.c);
    }


    public static void main(String[] args) {
        Child C = new Child1(1, 20,3,4);
        Inheritance_1 I = new Inheritance_1(C);
//        System.out.println(C.d );
        System.out.println(I.a);

    }
}
