package Demo4;

public class Demo4 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();


        myThread.setName("Thread 1");
        myThread1.setName("Thread 2");

        myThread1.start();

        myThread.start();

    }
}
