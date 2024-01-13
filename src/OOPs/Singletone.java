package OOPs;

 class A {
    private A(){

    }
    private static A instance =null;

    public static A get(){
        if(instance==null){
            instance= new A();
        }
        return instance;
    }


}
class B{
    public static void main(String[] args) {
        A obj = A.get();
        A ob1 = A.get();
    }
}
