package Multi_Threading;

public class A implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

        Thread a = new Thread(new A());
        Thread b = new Thread(new A());
        System.out.println(Thread.currentThread().getName());
        a.start();

//        try{
//            a.join();
//        } catch(Exception e){};
        System.out.println( a.getName());
        b.start();

    }
}
