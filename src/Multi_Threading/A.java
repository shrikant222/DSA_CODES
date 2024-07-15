package Multi_Threading;

public class A implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {

        Thread a = new Thread(new A());
        Thread b = new Thread(new A());
        System.out.println(Thread.currentThread().getName());
        a.start();
        System.out.println("Hello" );

//        try{
//            a.join();
//        } catch(Exception e){};


    }


}
class B{

}
