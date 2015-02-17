public class Wc{
  public int getLines(String text){
    if(text.length()==0) return 0;
    int numberOfLines = 0;
    String[] splittedText = text.split("\\n");
    return(splittedText.length);
  }

}
