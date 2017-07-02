package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ABCCommon;
import Utilities.BrowserSetup;


public class NewTest extends ABCCommon{
	


@Test
  public void LaunchSite() {
	  
	System.out.println("launching chrome browser!!");
	System.out.println(durl);
	wbDrv.get(durl);
	String expectedTitle = "ABC News (Australian Broadcasting Corporation)";
	String actualTitle = wbDrv.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	
  }
}
	