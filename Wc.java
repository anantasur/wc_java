public class Wc{

  public int getLines(String text){
    if(text.length()==0) return 0;
    String[] splittedText = text.split("\\n");
    return(splittedText.length);
  }

  public int getWords(String text){
    if(text.length()==0) return 0;
    String[] splittedText = text.split("\\s");
    return(splittedText.length);
  }
  public int getChars(String text){
    int delta = getLines(text);
    if(delta>1) return text.length()+delta;
    return text.length();
  }

}
