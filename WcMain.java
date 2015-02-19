import java.io.*;

public class WcMain {
  public static void main(String[] args) throws IOException{
    if(args[0] != null){
      WcReader file = new WcReader(args[0]);
      String text = file.reader();
    }
    System.out.println(text);
  }
}
