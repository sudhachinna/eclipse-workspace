package in.vamsoft.training.employee;

interface I2 {

  public default void m() {
    System.out.println("m in i1");
  }
}

interface I3 {

  public default void m() {
    System.out.println("m in i2");
  }
}

class I1 implements I2, I3 {
  public static void main(String[] args) {
    I1 obj = new I1();
    obj.m();

  }

  public void m() {
    I2.super.m();
  }

}
