package in.vamsoft.training.emp;

import java.io.*;

public class IOfilereadanwrite {
  public static void main(String[] args) {

    try (BufferedReader bread = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter fw = new BufferedWriter(new FileWriter("/home/vamsoft/Desktop/sudhachinna/Number.txt", true));
        BufferedReader fr = new BufferedReader(new FileReader("/home/vamsoft/Desktop/sudhachinna/Number.txt"));) {

      System.out.println("Please Enter the Name");
      String name = bread.readLine();
      fw.write("Name:" + name);
      fw.newLine();

      System.out.println("Enter your age"); 
      String age = bread.readLine();
      fw.write("Age:" + age);
      fw.newLine();

      System.out.println("Enter your Area");
      String area = bread.readLine();
      fw.write("Area:" + area);
      fw.newLine();
      bread.close();
      fw.close();

      String file = "";
      System.out.println("The data entered by you is:");

      while ((file = fr.readLine()) != null) {
        System.out.println(file);
      }

    } catch (Exception e) {
      e.printStackTrace();

    }
  }

}
