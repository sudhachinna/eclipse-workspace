package in.vamsoft.training.employee;

import java.util.*;

class Employee1 {
  int empid;
  String name;
  String address;

  public Employee1(String name, String address) {
    super();

    this.name = name;
    this.address = address;
  }
  public Employee1() {
    
  }

  public int getEmpid() {
    return empid;
  }

  public void setEmpid(int empid) {
    this.empid = empid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
  

}

public class EmployeeDetails {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Map<Integer, Employee1> map = new HashMap<Integer, Employee1>();
    map.put(1, new Employee1("sudha", "Trichy"));
    map.put(2, new Employee1("suba", "namakal"));
    map.put(3, new Employee1("prabha", "chennai"));
    
    System.out.println(map.get(1));

  }

}
