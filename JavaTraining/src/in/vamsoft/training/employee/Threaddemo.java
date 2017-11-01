package in.vamsoft.training.employee;

public class Threaddemo {

  public static void main(String[] args) throws InterruptedException {

    Runnablethread t = new Runnablethread();
    Thread t1 = new Thread(t);
    System.out.println("1st thread");
    t1.setName("A");
    t1.start();

    Thread t2 = new Thread(t);
    t2.setName("B");
    t2.start();
    t1.join();
    t2.join();
    t2.setPriority(1);
    System.out.println("2nd thread");
    
    

  }

}
