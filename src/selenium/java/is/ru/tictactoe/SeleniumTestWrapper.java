package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class SeleniumTestWrapper {
  static ChromeDriver driver;
  static String baseUrl;
  static String port;

  @BeforeClass
  public static void openBrowser() {
    ChromeOptions options = new ChromeOptions();
    //options.addArguments("--headless");
    //options.addArguments("--disable-gpu");
    //options.addArguments("--window-size=1200x600");
    //driver = new ChromeDriver(options);
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    port = System.getenv("PORT");
    if (port == null) {
      port = "4567";
    }

    baseUrl = "http://localhost:" + port;
  }

  @AfterClass
  public static void closeBrowser(){
    driver.quit();
  }
}
