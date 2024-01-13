package Multi_Threading;

class Producer extends Thread
{

    Company c= new Company();

    public Producer(Company c) {
        this.c=c;
    }

    public void run()
    {
        int i=1;
        while(true)
        {
            try {
                c.produce_item(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(1000);}catch(Exception e){}
            i++;
        }
    }
}
