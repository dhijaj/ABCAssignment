package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	
	public String baseUrl = "http://www.abc.net.au/news/";
    String driverPath = "/Users/dhineshraj/Documents/AA Selenium/test/test/chromedriver";
    public WebDriver driver ; 
    
    
  @Test
  public void firstclass() {
	  

      System.out.println("launching chrome browser!!!"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "ABC News (Australian Broadcasting Corporation)";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
	