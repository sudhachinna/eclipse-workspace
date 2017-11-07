package in.vamsoft.training.emp;

public class Threadfactorial extends Thread {

  int fact = 1;
  FileRead tn;

  public FileRead getTn() {
    return tn;
  }

  public void setTn(FileRead tn) {
    this.tn = tn;
  }

  @Override
  public void run() {
    synchronized (this) {
      try {

        this.wait();

      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      int num = tn.getNum();
      System.out.println("The get number is :" + num);
      for (int i = 0; i < num; i++) {

        fact += fact * i;
      }
      System.out.println("The Factorial of the given number is :" + fact);

    }
  }
}