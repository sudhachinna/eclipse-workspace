package in.vamsoft.training.emp;

public class Director extends Manager {

  private double budget;

  public Director(int empId, String name, String ssn, double salary, String depName, double budget) {
    super(empId, name, ssn, salary, depName);

  }

  public double getBudget() {
    return budget;
  }

}
