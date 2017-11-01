package in.vamsoft.training.emp;

public class Threadcount extends Thread {
  int counter;

  public Threadcount(int counter) {
    super();
    this.counter = counter;
  }

  public void run() {
    if (counter == 5) {
      for (int i = counter; i <= 100; i += 5) {
        System.out.println(i);
        try {
          sleep(2000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    } else if (counter == 10) {
      for (int i = counter; i <= 100; i += 10) {
        System.out.println(i);
      }
    } else {
      for (int i = counter; i <= 500; i += 100) {
        System.out.println(i);
      }
    }
  }

}
