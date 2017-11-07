package in.vamsoft.training.testemp;

import in.vamsoft.training.emp.*;

public class FileThread {
  public static void main(String[] args) {
    ThreadFile file1 = new ThreadFile(args[0]);
    ThreadFile1 file2 = new ThreadFile1(args[1]);
    file1.start();
    file2.start();
  }

}
