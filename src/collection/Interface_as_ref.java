package collection;

interface MyInterface {
    void myMethod();

}

class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implementation of myMethod");
    }
    public void h(){
        // TODO document why this method is empty
    }
}

class Main {
    public static void main(String[] args) {
        // Creating an object of the class that implements the interface
        MyInterface myInterfaceRef= new MyClass();

        // Creating a reference variable of the interface type
        // Assigning the object to the interface reference
        // Calling the method through the interface reference
        myInterfaceRef.myMethod();
//        myInterfaceRef.h();
    }
}
