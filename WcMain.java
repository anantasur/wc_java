import java.io.*;

public class WcMain {

  public static void main(String[] args) throws IOException{
    String text = null;
    String option = null;
    String fileName = null;
    Wc wc  = null;

    if(args[0].charAt(0) == '-'){
      option = args[0];
      fileName = args[1];
    }else{
      fileName = args[0];
    }

    if(fileName != null){
      WcReader file = new WcReader(fileName);
      text = file.reader();
    }
    wc = new Wc(text,option);
    System.out.println(wc.getWC()+" "+fileName);
  }

}
