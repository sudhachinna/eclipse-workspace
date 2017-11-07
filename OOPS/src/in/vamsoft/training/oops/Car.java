package in.vamsoft.training.oops;
/**
 * class name is car. Car is extends Vehicle.
 * @author vamsoft
 * 
 * 
 */

public abstract class Car extends Vehicle {
  /**
   * Constructor name is Car.
   */
  public Car() {
    System.out.println("Car.Car()");
  }
  /**
   * Method is handBrake().
   */

  public void handBrake() {
    System.out.println("Car.handBrake()");
  }

  /**
   * Start() is one of the method in Car.
   */
  public void start() {
    System.out.println("Car.start()");
  }

}
