package in.vamsoft.training.oopswatch;


public class WallClock extends Clock {
  public void minuteElapsed() {
    System.out.println("WallClock.minuteElapsed()");
  }

  public void hourElapsed() {
    System.out.println("WallClock.hourElapsed()");
  }
}