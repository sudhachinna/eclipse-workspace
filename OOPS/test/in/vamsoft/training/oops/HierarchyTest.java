package in.vamsoft.training.oops;


public class HierarchyTest {

  /**
   * 
   * 
   * @param args.
   */

  public static void main(String[] args) {
    SportsCar car = new SportsCar("SUV");
    Car c1 = new SportsCar();
    System.out.println(c1);
    System.out.println(car);
    car.start();

  }

}
