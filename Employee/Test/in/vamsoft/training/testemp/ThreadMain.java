package in.vamsoft.training.testemp;

import in.vamsoft.training.emp.Threadcount;

public class ThreadMain extends Thread {

  public static void main(String[] args) {

    Threadcount t1 = new Threadcount(5);
    t1.start();
    Threadcount t2 = new Threadcount(10);
    t2.start();
    Threadcount t3 = new Threadcount(100);

    t3.start();
  }

}
