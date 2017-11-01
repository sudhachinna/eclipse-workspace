package in.vamsoft.training.employee;

public class Runnablethread implements Runnable{
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(Thread.currentThread().getName() + ":" + i);
    }
    try
    {
     Thread.sleep(3000);
    }catch(Exception e)
    {
      e.printStackTrace();
    }
  }

}
