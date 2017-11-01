package in.vamsoft.training.employee;

public class Banksysn {

  double balance;

  public Banksysn(double balance) {

    this.balance = balance;
  }

  public Banksysn() {
    // TODO Auto-generated constructor stub
  }

  public double getBalance() {
    return balance;
  }

  public void withdraw(double amount) {
    if ((balance - amount) >= 0) {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      balance-= amount;
      System.out.println(
          "withdrew by thread:" + Thread.currentThread().getName() + "Successful. the balance is:" + getBalance());
    } else {
      System.out.println(
          "Insufficient balance for thread:" + Thread.currentThread().getName() + "The balance is:" + getBalance());
    }
  }

}
