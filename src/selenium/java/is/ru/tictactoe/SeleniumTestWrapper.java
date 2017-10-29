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
    //options.setBinary("/tmp/google-chrome-stable_current_amd64.deb");
    options.addArguments("--headless");
    options.addArguments("--disable-gpu");
    options.addArguments("headless");
    options.addArguments("window-size=1200x600");
    driver = new ChromeDriver(options);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
