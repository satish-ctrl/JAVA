package MultiThreading;

class MyThread extends Thread{
    public void run(){
        System.out.println("Child thread");
    }
}
public class CreateOwnThread {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();

    }
}
