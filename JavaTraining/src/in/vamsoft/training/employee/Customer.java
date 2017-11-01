package in.vamsoft.training.employee;

import java.util.*;

public class Customer implements Comparable<Customer> {
  int cusid;
  String name;
  int mobile;
  String Address;

  public Customer(String string, int i) {
    // TODO Auto-generated constructor stub
  }
 public Customer() {
    // TODO Auto-generated constructor stub
  }
void compare(List<Customer> people1,List<Customer> people2)
  {
    this.name=name;
    System.out.println(people1);
  }


  public static void main(String[] args) {
    List<Customer> people1 = new ArrayList<Customer>();
    people1.add(new Customer("Homer", 38));
    List<Customer> people2 = new ArrayList<Customer>();
    people2.add(new Customer("Homer", 38));   
    
    Customer obj1=new Customer();
    obj1.compare(people1, people2);
  }
  @Override
  public int compareTo(Customer o) {
    // TODO Auto-generated method stub
    return 0;
  }




}
