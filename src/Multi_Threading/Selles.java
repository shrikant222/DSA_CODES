package Multi_Threading;

class Consumer extends Thread{
   Company c = new Company();

    public Consumer(Company c) {
        this.c=c;
    }

    public void run()
    {
        while(true)
        {
            try {
                this.c.consume_item();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(2000);}catch(Exception e){}
        }
    }
}
