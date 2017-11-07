package in.vamsoft.training.emp;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOPathClass {
  public static void main(String[] args) {
    Path p = Paths.get("/home/vamsoft/Desktop/sudhachinna/Sudha.txt");
    Path p1 = Paths.get("/home/vamsoft/Desktop/sudhachinna/Sudha.txt");

    System.out.println("Paths equal:" + p.equals(p1));
    System.out.println("Excuting Path methos");

    System.out.println("File System:" + p.getFileName());
    System.out.println("Parent:" + p.getFileSystem());
    System.out.println("Name count" + p.getNameCount());
    System.out.println("Root" + p.getRoot());
    System.out.println("The name at subscript 1:" + p.getName(1));
    System.out.println("Finished executing path methods");

    Path destpath = Paths.get("home/vamsoft/Desktop/sudhachinna/Sudha.txt");
    try {
      Files.copy(p, destpath, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
      System.out.println("File copied");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
