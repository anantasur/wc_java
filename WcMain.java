import java.io.*;

public class WcMain {
  public static void main(String[] args) throws IOException{
    String text = null;
    if(args[0] != null){
      WcReader file = new WcReader("one.txt.txt");
      text = file.reader();
    }
    System.out.println(text);
    Wc wc = new Wc(text);
    System.out.println(wc.getWC());
  }
}
