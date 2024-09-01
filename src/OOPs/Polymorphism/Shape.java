package OOPs.Polymorphism;

public class Shape {
     public void area(){
        System.out.println("im in shape");
    }
}
class Circle extends Shape{
    @Override
    public void area(){
        System.out.println("circle");
    }
}
class Square extends Shape{

    public void area(){
        System.out.println("Square");
    }
}
class Rec extends Shape{
    public void area(){
        System.out.println("Rec");
    }
}
class Main{
    public static void main(String[] args) {
        Circle c= new Circle();
        Rec r = new Rec();
//        Square s = new Square();
//        r.area();
//        s.area();
//        c.area();
        Shape c1 = new Circle();
        c1.area();
    }
}