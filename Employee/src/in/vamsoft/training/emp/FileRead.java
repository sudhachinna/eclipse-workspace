package in.vamsoft.training.emp;

import java.io.*;

public class FileRead extends Thread {

  public void run() {
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(new File("./inputFile.txt")));
      String buffer = null;
      while ((buffer = br.readLine()) != null) {
        System.out.println(buffer);
      }

    } catch (Exception e) {
    }
  }

}
