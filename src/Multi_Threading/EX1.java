package Multi_Threading;
class Hi implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hi "+i);
            try{Thread.sleep(1000);}
            catch(Exception e){
            }
        }
    }
}

class Hello implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello "+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

class HiHello{
    public static void main(String[] args) {
   Thread o1= new Thread(new Hi());
        o1.start();
        try{Thread.sleep(100);}catch (Exception e){};
   Thread o2 = new Thread(new Hello())   ;
   o2.start();
    }
}
