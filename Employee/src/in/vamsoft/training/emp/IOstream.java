package in.vamsoft.training.emp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IOstream {
  public static void main(String[] args) {

    BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));

    String options=null;
    System.out.println("please enter ur name");
    do {

      try {

        String name = bread.readLine();
        System.out.println("hello" + name);
        options=bread.readLine();
        bread.close();
      } catch (Exception e) {
        e.printStackTrace();

      }
      
    } while (options.equalsIgnoreCase("quit"));
    {
      
    }
  }

}
