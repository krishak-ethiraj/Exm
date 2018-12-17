package krish;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hello world");
  }

  @AfterTest
  public void afterTest() {
  }

}
