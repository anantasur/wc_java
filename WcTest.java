import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

  @Test
  public void getLines_gives_0_for_empty_string (){
    String text = "";
    Wc wc = new Wc(text);
    assertEquals(0,wc.getLines());
  }

  @Test
  public void getLines_gives_1_for_string_with_space (){
    String text = " ";
    Wc wc = new Wc(text);
    assertEquals(1,wc.getLines());
  }

  @Test
  public void getLines_gives_2_for_two_lines_present_in_a_string (){
    String text = "hello, this is a good day.\nWhat do you think?\n";
    Wc wc = new Wc(text);
    assertEquals(2,wc.getLines());
  }

  @Test
    public void getWords_gives_0_for_no_words_in_a_string (){
    String text = "";
    Wc wc = new Wc(text);
    assertEquals(0,wc.getWords());
  }

  @Test
    public void getWords_gives_1_for_space_in_a_string (){
    String text = " ";
    Wc wc = new Wc(text);
    assertEquals(0,wc.getWords());
  }

  @Test
  public void getWords_gives_1_for_one_word_in_a_string (){
    String text = "Hello";
    Wc wc = new Wc(text);
    assertEquals(1,wc.getWords());
  }

  @Test
  public void getChars_gives_0_for_empty_string (){
    String text = "";
    Wc wc = new Wc(text);
    assertEquals(0,wc.getChars());
  }

  @Test
  public void getChars_gives_5_for_hello (){
    String text = "hello";
    Wc wc = new Wc(text);
    assertEquals(5,wc.getChars());
  }

  @Test
  public void getChars_gives_19_for_hello_How_are_you (){
    String text = "hello, How are you?";
    Wc wc = new Wc(text);
    assertEquals(19,wc.getChars());
  }

  @Test
  public void getChars_gives_48_for_hello_How_are_you (){
    String text = "hello, this is a good day.\nWhat do you think?\n";
    Wc wc = new Wc(text);
    assertEquals(48,wc.getChars());
  }

  @Test
  public void getChars_gives_40_for_hello_How_are_you (){
    String text = "hello, How are you?\nI am fine\nAnd you?\n";
    Wc wc = new Wc(text);
    assertEquals(42,wc.getChars());
  }

  @Test
  public void wc_gives_42_char_count_3_line_count_and_9_word_count (){
    String text = "hello, How are you?\nI am fine\nAnd you?\n";
    Wc wc = new Wc(text);
    assertTrue(wc.getWC().equals("3 9 42"));
  }

  @Test
  public void wc_gives_40_char_count_3_line_count_and_9_word_count (){
    String text = "hello, How are you?\nI am fine\nAnd you?";
    Wc wc = new Wc(text);
    assertTrue(wc.getWC().equals("3 9 40"));
  }
}
