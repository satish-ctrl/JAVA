package MultiThreading;

public class LaunchMultiThreading1 {
    public static void main(String[] args) {
        System.out.println("Main Thread");

        System.out.println("Before changing");
        String name = Thread.currentThread().getName();
        System.out.println("The name of main thread is :"+name);
        System.out.println("The priority of main thread is :"+Thread.currentThread().getPriority());

        System.out.println("After changing");
        Thread t = Thread.currentThread();
        t.setName("PW");
        t.setPriority(1);
        String name1 = Thread.currentThread().getName();
        System.out.println("The name of main thread is :"+name1);
        System.out.println("The priority of main thread is :"+Thread.currentThread().getPriority());

    }
}
