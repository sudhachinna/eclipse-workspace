package in.vamsoft.training.emp;

import java.io.*;
import java.util.Scanner;

public class FileRead extends Thread {

  Threadfactorial ft;
  int num;

  public Threadfactorial getFt() {
    return ft;
  }

  public void setFt(Threadfactorial ft) {
    this.ft = ft;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  @Override
  public void run() {

    try {
      Scanner s = new Scanner(new File("/home/vamsoft:/Number.txt"));
      while (s.hasNextLine()) {

        num = s.nextInt();
        synchronized (ft) {

          ft.notify();
        }

      }
      s.close();

    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}
