package in.vamsoft.training.testemp;

import in.vamsoft.training.emp.*;

public class EmployeeTest {

  public static void main(String[] args) {

    Engineer obj = new Engineer(101, "ramu", "012-34-5678", 12000);
    Manager obj1 = new Manager(102, "suba", "011-44-5578", 12000, "US Marketing");
    Admin obj2 = new Admin(103, "prabha", "015-54-5608", 12000);
    Director obj3 = new Director(104, "siva", "000-34-9078", 12000, "Global Marketing", 1000000.00);
    Employee obj5 = new Employee(100, "ariu ", "012-34-5678", 12000);
    EmployeeTest obj4 = new EmployeeTest();

    obj4.printEmployee(obj);
    obj4.printEmployee(obj1);
    obj4.printEmployee(obj2);
    obj4.printEmployee(obj3);
    obj.raiseSalary(1000.0);
    obj1.raiseSalary(15000.0);
    obj2.raiseSalary(15000.0);
    obj3.raiseSalary(15000.0);
    obj5.setName("aaa");

  }

  public void printEmployee(Employee emp) {
    System.out.println(emp);

  }

}
