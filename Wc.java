public class Wc{

  private String text = null;

  public Wc(String text){
    this.text = text;
  }

  public int getLines(){
    if(text.length()==0) return 0;
    String[] splittedText = text.split("\\n");
    return(splittedText.length);
  }

  public int getWords(){
    if(text.length()==0) return 0;
    String[] splittedText = text.split("\\s");
    return(splittedText.length);
  }

  private int occurenceOfChar(char c) {
		int i,count = 0,limit = text.length();
		char[] tmp = text.toCharArray();
		for(i = 0;i<limit;i++)
			if(tmp[i] == c)
				count++;
		return count;
	}

  public int getChars(){
    int delta = occurenceOfChar('\n');
    if(delta>1) return text.length() + delta;
    return text.length();
  }

  public String getWC(){
    return getLines()+" "+getWords()+" "+getChars();
  }

}
