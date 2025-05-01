package MultiThreading;

class Queue{
    int x;
    boolean flag = false;
    synchronized public void put(int j){
        try{
            if(flag == true){
                wait();
            }
            else{
                x = j;
                System.out.println("I have Produced value x "+x);
                flag = true;
                notify();
            }
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
    }
    synchronized  public void get(){
        try{
            if(flag == false){
                wait();
            }
            else{
                System.out.println("I have Consumed value "+x);
                flag = false;
                notify();
            }
        } catch (Exception e) {
            System.out.println("Some Problem");
        }
    }
}

class Producer extends Thread{
    Queue q;
    Producer(Queue b){
        q = b;
    }
    public void run(){
        int i=1;
        while(true){
            q.put(i++);
        }
    }
}

class Consumer extends Thread{
    Queue q;
    Consumer (Queue a){
        q = a;
    }
    public void run(){
        while(true){
            q.get();
        }
    }
}
public class ProduceConsume {
    public static void main(String[] args) {

        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();
    }
}
