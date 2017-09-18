package in.vamsoft.training.OOPs;

public class Plane extends Vehicle implements Flying{

	public Plane() {
		System.out.println("Plane.Plane()");
	}
	@Override
	public void start() {
		System.out.println("Plane.start()");
		
	}

	@Override
	public void stop() {
    System.out.println("Plane.stop()");
		
	}

	@Override
	public void brake() {
		System.out.println("Plane.brake()");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void takeoff() {
		System.out.println("Plane.takeoff()");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		System.out.println("Plane.land()");
		// TODO Auto-generated method stub
		
	}

}
