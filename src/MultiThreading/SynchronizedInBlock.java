package MultiThreading;

class Car implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName()+" "+"has entered parking lot");
            Thread.sleep(1000);
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName()+" "+"Got into Car to Derive");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+"Started to drive the car ");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+"Come back and park the car");
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println("Some Problem");
        }

    }
}
public class SynchronizedInBlock {
    public static void main(String[] args) {
        Car c=new Car();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("son-1");
        t2.setName("son-2");
        t3.setName("son-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
