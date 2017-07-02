package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ABCCommon;

public class JustIn  extends ABCCommon {
	@Test
	  public void LoadJustIn() {
		System.out.println("Clicking JustIn");
		Assert.assertEquals(true, isElementPresent("Justin"));
		getElement("Justin").click();
		List<WebElement> articles = wbDrv.findElements(By.cssSelector(".article-index>li"));
		
		int articleCount = articles.size();
		
		System.out.println("articleCount" + articleCount);
		
		
		
	  }
}
