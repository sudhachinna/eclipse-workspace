package in.vamsoft.training.emp;
/*
 * @class name is manager. manager extends employee class
 */
public class Manager extends Employee {

  private String depName;
  // private Employee staff[]= {""}

  public Manager(int empId, String name, String ssn, double salary, String depName) {
    super(empId, name, ssn, salary);
    this.depName = depName;
  }

  public String getDepName() {
    return depName;
  }

}
