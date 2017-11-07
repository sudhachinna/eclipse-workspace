package in.vamsoft.training.emp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class IOfilecopy {
  public static void main(String[] args) {
    System.out.println("Enter the source path");
    Scanner sc = new Scanner(System.in);
    String uinput = sc.next();
    System.out.println("Enter the destination path");
    Scanner sc1 = new Scanner(System.in);
    String uoutput = sc1.next();

    try (FileInputStream fis = new FileInputStream(uinput); FileOutputStream fos = new FileOutputStream(uoutput);)

    {
      System.out.println("hai");
      int c = 0;
      while ((c = fis.read()) != -1) {
        fos.write(c);
      }
      System.out.println("Fill copied");
    } catch (Exception e) {
      // "/home/vamsoft/Desktop/sudhachinna/slide-one.jpg"
    }

  }
}
