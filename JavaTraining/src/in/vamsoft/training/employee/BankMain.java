package in.vamsoft.training.employee;

public class BankMain implements Runnable{
  
  Banksysn a;
  double withdrawAmt;
  
  @Override
  public void run() {
    System.out.println("Balance for:"+Thread.currentThread().getName()+""+a.getBalance());
    synchronized(a){
      a.withdraw(withdrawAmt);
    }
    
  }
  
public BankMain(Banksysn a, double withdrawAmt) {
    
    this.a = a;
    this.withdrawAmt = withdrawAmt;
  }

public static void main(String[] args) {
    
    Banksysn account = new Banksysn(1000);
    BankMain obj1=new BankMain(account,5000);
    BankMain obj2=new BankMain(account,5000);
    Thread t1=new Thread(obj1,"Thread 1");
    Thread t2=new Thread(obj2,"Thread 2");
    t1.start();
    t2.start(); 
   
  }

}
