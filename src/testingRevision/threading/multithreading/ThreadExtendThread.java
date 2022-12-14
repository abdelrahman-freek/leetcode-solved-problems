package testingRevision.threading.multithreading;

public class ThreadExtendThread extends Thread {

    private static  int count;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            count++;
            //   System.out.println(" i = " + i);
        }
    }

    public  int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting Thread thread");
        ThreadExtendThread threadExtendThread1 = new ThreadExtendThread();

        threadExtendThread1.start();
        threadExtendThread1.join();
        System.out.println("Thread 1 count = "+threadExtendThread1.getCount());

        ThreadExtendThread threadExtendThread2 = new ThreadExtendThread();

        threadExtendThread2.start();
        threadExtendThread2.join();

        System.out.println("Thread 2 count = "+threadExtendThread2.getCount());

        System.out.println("ending Thread thread");
    }
}
