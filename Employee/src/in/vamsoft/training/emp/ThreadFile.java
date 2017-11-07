package in.vamsoft.training.emp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThreadFile extends Thread {
  String filename;

  public ThreadFile(String file) {
    // TODO Auto-generated constructor stub
    this.filename = file;
  }

  @Override
  public void run() {

    Scanner s;
    try {
      s = new Scanner(new File(filename));

      while (s.hasNextInt()) {
        int num = s.nextInt();
        System.out.println("This Output from Thread1 :" + num);
        try {
          sleep(2000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
      s.close();
    } catch (FileNotFoundException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }
}
