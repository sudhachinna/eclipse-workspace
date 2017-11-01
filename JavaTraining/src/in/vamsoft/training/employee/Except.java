package in.vamsoft.training.employee;

public class Except {
  /*
   * @this is nested try block
   */
  public static void main(String[] args) {
    try {
      try {
        System.out.println("inner");
      } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
      }
    } catch (NumberFormatException e) {
      System.out.println("this is exception22" + e.getMessage());
    } catch (Exception e) {
      System.out.println("this is exception" + e.getMessage());
    }
  }

}
