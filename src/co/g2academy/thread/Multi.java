package co.g2academy.thread;

public class Multi extends Thread{
    public void run() {
        int random = (int) (Math.random() * 10) * 1000;
        try {
            Thread.sleep(random); //blocked thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " is running.. and was sleeping for " + random + "ms");
    }
    public static void main(String[] args){
      for (int i = 0; i < 100; i++) {
        Multi t1 = new Multi();
        t1.setName("thread " + i);
        t1.start();
	}
}

        }
