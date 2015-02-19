import java.io.*;
public class WcReader {
  private String fileName = null;

  public WcReader(String fileName){
    this.fileName = fileName;
  }

  public String reader() throws IOException{

    File file = new File(fileName);
    int length = (int)file.length();
    FileReader fr = null;

    try{
      fr = new FileReader(file);
    }
    catch(Exception e){
    }

    BufferedReader br = new BufferedReader(fr);
    char[] cbuf = new char[length+3];
    br.read(cbuf, 0, length);
    String text = new String(cbuf);
    return text;
  }
}
