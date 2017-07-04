package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ABCCommon;

public class SearchRadioProgram extends ABCCommon {
	@Test
	public void LoadABRadio1() throws InterruptedException  {
	wbDrv.get(dABCRadio);
	WebElement we =getElement("radioSearchBar");
	we.click();
	we.sendKeys("Big Ideas");
	getElement("searchSubmit").click();
	
	Thread.sleep(5000);
	Assert.assertEquals(true, isElementPresent("searchHeanding"));
	
	
	}

}
