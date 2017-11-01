package in.vamsoft.training.employee;

import java.util.*;

public class Mapdemo {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    System.out.println(map.put(1, "sudha"));
    System.out.println(map.put(2, "sudhashini"));
    System.out.println(map.put(3, "subha"));
    System.out.println(map.put(4, "prabha"));
    System.out.println(map.put(5, "siva"));
    
    System.out.println(map);
    
    System.out.println(map.get(2));
    
    if(!map.containsKey(4)) {
      map.put(4, "value");
      System.out.println(map.containsValue("value"));
      System.out.println(map);
    }
  }
}
