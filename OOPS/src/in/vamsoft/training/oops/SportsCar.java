package in.vamsoft.training.oops;

public class SportsCar extends Car {

  public SportsCar(String model) {
	System.out.println("SportsCar.SportsCar() - PC");
	System.out.println(model);

  }

  public SportsCar() {
	System.out.println("SportsCar.SportsCar() - DNAC");
  }

  public void stop() {
	System.out.println("SportsCar.stop()");
  }

  public void brake() {
	System.out.println("SportsCar.brake()");
  }

  public void start() {
	System.out.println("Car.start()");
  }

  public void fourWheelDrive() {
	System.out.println("SportsCar.fourWheelDrive()");
  }
}
