package OOPs.inhe;

import OOPs.inhe.*;

 class Box{
    double l;
    double h;
    double w;

     public Box() {
         System.out.println("Box");
         this.l = -1;
         this.h = -1;
         this.w = -1;
     }
     Box(double side){
         this.l = side;
         this.h = side;
         this.w = side;
     }
     public Box(double l, double h, double w) {
         this.l = l;
         this.h = h;
         this.w = w;
     }

     Box(Box old){
         this.l=old.l;
         this.h=old.h;
         this.w=old.w;
     }




 }
 class BoxWeight extends Box{
     double weight;
     public BoxWeight(double l, double h, double w, double weight) {
         super(l, h, w);
         this.weight = weight;
     }

     public BoxWeight(Box old, double weight) {
         super(old);
         this.weight = weight;
     }

     public BoxWeight(double side, double weight) {
         super(side);
         this.weight = weight;
     }

     public BoxWeight() {
         System.out.println("Boxwight");
         this.weight=-1;
     }

     public BoxWeight(BoxWeight oldw){
         //Box box1 = new BoxWeight()
         super(oldw);
        weight=oldw.h;
         System.out.println(this.weight);
//         System.out.println(super.weight);
     }




 }
 class Price extends BoxWeight{
    double price;

     public Price(double price) {
         this.price = price;
     }

     public Price(double l, double h, double w, double weight, double price) {
         super(l, h, w, weight);
         this.price = price;
     }
 }

 class Main{
     public static void main(String[] args) {
//         Box box = new Box(1,4,8);
//         BoxWeight bw1 = new BoxWeight(box,10);
//         BoxWeight bw = new BoxWeight(bw1,box);
//         System.out.println(bw.weight);
//         BoxWeight box1 = new BoxWeight();
         // Access method depends on ref variable not on constructor
         Box box1 = new Price(1);
//         box1.weight
        Box bo = new Box(box1);
         System.out.println(bo.w);

//         BoxWeight box1 = new Box(); error

     }
 }