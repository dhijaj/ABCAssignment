package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ABCCommon;

public class ABCRadios extends ABCCommon {
	
	  @Test
	  public void LoadABRadio() throws InterruptedException  {
		  
		  wbDrv.get(dABCRadio);
		  Thread.sleep(5000);
		  
		  Actions builder = new Actions(wbDrv);
		  builder.moveToElement(getElement("radioPrograms")).perform();
		  getElement("radioPrograms").click();
		  
		  JavascriptExecutor jse = ((JavascriptExecutor) wbDrv);
		  jse.executeScript("window.scrollTo(0, 250)");
		  Actions action = new Actions(wbDrv);
		 
			  action.moveToElement(getElement("BigIdeas"));
			  Assert.assertEquals(true, isElementPresent("BigIdeas"));
	  }
}



