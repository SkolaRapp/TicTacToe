package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestTicTacWeb extends SeleniumTestWrapper {
  @Test
  public void testTitleMatches() {
    driver.get(baseUrl);
    System.out.println(driver.getTitle());
    assertEquals("localhost:4567", driver.getTitle());
  }

  @Test
  public void testInsertNumber() throws Exception {
    driver.get(baseUrl);
    /* Remove Thread.sleep... */
    Thread.sleep(2000);

    WebElement input = driver.findElement(By.id("numberFromForm"));
    input.sendKeys("1");
    
    //Submit form = input.sendKeys(Keys.RETURN)
    // Or using submit() on the form or any element in the form

    /* Remove Thread.sleep... */
    Thread.sleep(2000);
    /* ... finish test! */
  }
}
