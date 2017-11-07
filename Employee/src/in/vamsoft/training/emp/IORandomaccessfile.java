package in.vamsoft.training.emp;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class IORandomaccessfile {
  public static void main(String[] args) throws IOException {
    RandomAccessFile afile = new RandomAccessFile("/home/vamsoft/Desktop/sudhachinna/Sudha.txt", "rw");
    FileChannel inchannel = afile.getChannel();

    ByteBuffer buf = ByteBuffer.allocate(10);
    int bytesRead = inchannel.read(buf);

    while (bytesRead != -1) {
      buf.flip();

      while (buf.hasRemaining()) {
        System.out.println((char) buf.get());
      }
      buf.clear();
      bytesRead = inchannel.read(buf);

    }
    afile.close();
  }
}
