package in.vamsoft.training.oopswatch;

public interface Ticking {
  int factor = 60;

  void tick();

  void minuteElapsed();

  void hourElapsed();
}