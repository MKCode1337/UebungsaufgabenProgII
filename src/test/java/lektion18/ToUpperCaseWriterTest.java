package lektion18;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import lektion18.ToUpperCaseWriter.ToUpperCaseWriter;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ToUpperCaseWriterTest
{
  @Test
  public void aATest() {
    assertTrue(writeInOutTest("a", "A"));
  }

  @Test
  public void test1ATest() {
    assertTrue(writeInOutTest("1", "1"));
  }

  @Test
  public void testASCII128() {
    for(int i = 0; i <= 127; i++ ) {
      String input = Integer.toString(i);
      String expected = Integer.toString(i);
      if (i >=97 && i <= 122) {
        expected = expected.toUpperCase();
      }
      writeInOutTest(input,expected);
    }
  }

  public boolean writeInOutTest(String input, String expected){
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
         OutputStreamWriter osw = new OutputStreamWriter(baos);
         ToUpperCaseWriter writer = new ToUpperCaseWriter(osw);)
    {
      writer.write(input);
      writer.flush();
      String output = baos.toString();
      if (expected.equals(output)){
        return true;
      }
      else {
        return false;
      }
    }
    catch (IOException e) {
      fail("IOException" + e.getMessage());
    }
    return true;
  }
}
