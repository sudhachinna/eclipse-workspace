package in.vamsoft.training.testemp;

import in.vamsoft.training.emp.*;

public class FileMain extends Thread {
  public static void main(String[] args) {
    FileRead t1 = new FileRead();
    Threadfactorial t2 = new Threadfactorial();
    t1.start();
    t2.start();

  }
}
