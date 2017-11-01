package in.vamsoft.training.employee;

public class Daemon implements Runnable {
  @Override
  public void run() {
    if (Thread.currentThread().isDaemon()) {
      System.out.println("Daemon thread");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    } else {
      System.out.println("user thread");
    }

  }

  public static void main(String[] args) {
    Daemon obj = new Daemon();
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj);
    t1.setDaemon(true);
    t1.start();
    t2.start();

  }

}
