public class Wc{

  private String text = null;

  public Wc(String text){
    this.text = text;
  }

  public int getLines(){
    int delta = occurenceOfChar('\n');
    return delta;
  }

  public int getWords(){
  		return this.text.split("[ \n]").length;
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
    return text.length();
  }

  public String getWC(){
    return getLines()+" "+getWords()+" "+getChars();
  }

}
