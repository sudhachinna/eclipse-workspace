package in.vamsoft.training.testemp;

import in.vamsoft.training.emp.*;

public class FileMain extends Thread {
  public static void main(String[] args) {

    FileRead tn = new FileRead();
    Threadfactorial ft = new Threadfactorial();
    tn.setFt(ft);
    ft.setTn(tn);
    tn.start();
    ft.start();

  }
}
