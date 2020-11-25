package co.g2academy.thread;

public class MultiThreadInterface implements Runnable {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MultiThreadInterface m = new MultiThreadInterface();
        Thread thread = new Thread(m);
        thread.start();
    }
}
