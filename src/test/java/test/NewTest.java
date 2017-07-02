package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ABCCommon;
import Utilities.BrowserSetup;

public class NewTest extends ABCCommon{
	
	
	public String baseUrl = "http://www.abc.net.au/news/";

@Test
  public void firstclass() {
	  
	System.out.println("launching chrome browser!!"); 
	wbDrv.get(baseUrl);
	String expectedTitle = "ABC News (Australian Broadcasting Corporation)";
	String actualTitle = wbDrv.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	wbDrv.close();
  }
}
	