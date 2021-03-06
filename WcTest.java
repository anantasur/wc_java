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
  public void getLines_gives_0_for_string_with_space (){
    String text = " ";
    Wc wc = new Wc(text);
    assertEquals(0,wc.getLines());
  }

  @Test
  public void getLines_gives_2_for_two_lines_present_in_a_string (){
    String text = "hello, this is a good day.\nWhat do you think?\n";
    Wc wc = new Wc(text);
    assertEquals(2,wc.getLines());
  }

  @Test
    public void getWords_gives_0_for_space_in_a_string (){
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
    assertEquals(46,wc.getChars());
  }

  @Test
  public void getChars_gives_39_for_hello_How_are_you (){
    String text = "hello, How are you?\nI am fine\nAnd you?\n";
    Wc wc = new Wc(text);
    assertEquals(39,wc.getChars());
  }

  @Test
  public void wc_gives_42_char_count_3_line_count_and_9_word_count (){
    String text = "hello, How are you?\nI am fine\nAnd you?\n";
    Wc wc = new Wc(text);
    assertTrue(wc.getWC().equals("3 9 39"));
  }

  @Test
	public void wc_should_return_1_for_hello_newLine_my_world_when_l_option_is_given () {
		String sentence = new String("hello\nmy world");
		Wc wc = new Wc(sentence,"-l");
		assertEquals(wc.getWC(), "1");
	}

  @Test
  public void wc_should_return_14_for_hello_newLine_my_world_when_c_option_is_given () {
    String sentence = new String("hello\nmy world");
    Wc wc = new Wc(sentence,"-c");
    assertEquals(wc.getWC(), "14");
  }

  @Test
  public void wc_should_return_3_for_hello_newLine_my_world_when_w_option_is_given () {
    String sentence = new String("hello\nmy world");
    Wc wc = new Wc(sentence,"-w");
    assertEquals(wc.getWC(), "3");
  }
}
