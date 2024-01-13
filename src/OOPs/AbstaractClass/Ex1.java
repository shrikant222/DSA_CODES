package OOPs.AbstaractClass;

abstract class parent{
    int age;
    static void hello(){
        System.out.println("hello");
    }
    abstract void career(String name);
}
class son extends parent{
    @Override
    void career(String name){
        System.out.println(" "+name);
    }

    public static void main(String[] args) {
        son s = new son();
        hello();
        s.career("one");
    }
}
