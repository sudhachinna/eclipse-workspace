package in.vamsoft.training.emp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.stream.FileImageInputStream;

public class IOmark {
  public static void main(String[] args) {
    try (InputStream is = new BufferedInputStream(new FileInputStream("/home/vamsoft/Desktop/sudhachinna/Number.txt"),
       1);) {

      System.out.println("character prited");

      System.out.println((char) is.read());
      System.out.println((char) is.read());

      is.mark(10);

      System.out.println("mark() invoked");
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());
      System.out.println((char) is.read());

      if (is.markSupported()) {
        is.reset();
        System.out.println("reset() invoked");
        System.out.println((char) is.read());
        System.out.println((char) is.read());
        System.out.println((char) is.read());
      } else {
        System.out.println("inputstream does not supoport reset()");
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
