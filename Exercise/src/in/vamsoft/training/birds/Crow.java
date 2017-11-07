package in.vamsoft.training.birds;

public class Crow extends Bird{
	public void fly()
	{
		System.out.println("Crow.fly()");
	}
	public void talk()
	{
		System.out.println("Crow.talk()");
	}
	public void talk(String talk)
	{
		System.out.println("Crow"+talk);
	}

	public void eat()
	{
		System.out.println("Crow".eat);
	}
	
}
