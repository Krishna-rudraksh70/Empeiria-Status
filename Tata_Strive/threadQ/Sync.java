package threadQ;

class counter{
    int count;

    public synchronized void increment(){
        count++;
    }
}

public class Sync {
    public static void main(String[] args) {

            counter c = new counter();

            Runnable ob1 = () -> {
                for(int i=0; i<10000; i++)
                    c.increment();
            };

            Runnable ob2 = () -> {
                    for(int i=0; i<10000; i++)
                        c.increment();
            };

            Thread t1 = new Thread(ob1);
            Thread t2 = new Thread(ob2);

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(c.count);
        
    }
}
