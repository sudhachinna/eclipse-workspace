package in.vamsoft.training;

import in.vamsoft.training.OOPs.Car;
import in.vamsoft.training.OOPs.SportsCar;

public class HierarchyTest {

	public static void main(String[] args) {

		SportsCar car = new SportsCar("SUV");

		Car c1 = new SportsCar();

		System.out.println(c1);
		
		System.out.println(car);

		car.start();

	}

}
