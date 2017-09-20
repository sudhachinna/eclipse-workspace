package in.vamsoft.training.oopswatch;

public abstract class Clock implements Ticking {
  public void tick() {
    System.out.println("Clock.tick()");
  }
}