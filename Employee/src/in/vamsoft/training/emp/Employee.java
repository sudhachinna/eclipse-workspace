package in.vamsoft.training.emp;

public class Employee {

  private int empId;
  private String name;
  private String ssn;
  private double salary;
  
  public Employee(int empId, String name, String ssn, double salary) {
    super();
    this.empId = empId;
    this.name = name;
    this.ssn = ssn;
    this.salary = salary;
  }

  public int getEmpId() {
    return empId;
  }

  public void setName(String name) {
    if (name == null) {
      System.out.println("Please Enter the name");

    } else {
      this.name = name;
    }
  }

  public void getName(String name) {
    this.name = name;
  }

  public String getSsn() {
    return ssn;
  }

  public double getSalary() {
    return salary;
  }

  public void raiseSalary(double increase) {
    if (increase > 0) {
      salary += increase;
      System.out.println("Employeeincreasing salary:" + salary);
    }
  }

  @Override
  public String toString() {    
    return "Employee [empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + "]";
  }

}
