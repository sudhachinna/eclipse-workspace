package in.vamsoft.training.employee;

public class Employee {
  private int employeecode;
  String employeename;
  double employeesalary;

  public Employee(int employeecode, String employeename) {

    this(employeecode, employeename, 30000);
  }

  public Employee(int employeecode, String employeename, double employeesalary) {
    super();
    this.employeecode = employeecode;
    this.employeename = employeename;
    this.employeesalary = employeesalary;
  }

  public Employee() {
    // TODO Auto-generated constructor stub
  }

  public String getEmployeename() {
    return employeename;
  }

  public void setEmployeename(String employeename) {
    this.employeename = employeename;
  }

  public int getEmployeecode() {
    return employeecode;
  }

  public double getEmployeesalary() {
    return employeesalary;
  }

  public void checksalary(double employeesalary) {
    if (employeesalary >= 10000.0) {
      System.out.println(employeesalary);
    } else {
      System.out.println("Enter above 10000 salary");
    }
  }

}
