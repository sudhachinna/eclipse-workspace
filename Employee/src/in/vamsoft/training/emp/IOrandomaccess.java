package in.vamsoft.training.emp;

import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class IOrandomaccess {
  public static void main(String[] args) {
    try {
      RandomAccessFile randomaccess = new RandomAccessFile("/home/vamsoft/Desktop/sudhachinna/Number.txt", "rw");
      randomaccess.write("Hello how are you?".getBytes());
      randomaccess.seek(5);
      int c;
      while ((c = randomaccess.read()) != -1) {
        System.out.println();
      }
      randomaccess.seek(randomaccess.length());
      randomaccess.write("Appending to file".getBytes());
      System.out.println();
      randomaccess.seek(0);

      while ((c = randomaccess.read()) != -1) {
        System.out.println((char) c);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
