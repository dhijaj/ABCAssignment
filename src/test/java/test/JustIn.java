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
		
		System.out.println("Article Count: " + articleCount);
		
		for(int i=1;i<=articleCount;i++){
			
			System.out.println("Checking Title, Timestamp & Text for Article -" + i);
			
			WebElement articleTitle = wbDrv.findElement(By.cssSelector(".article-index>li>h3>a"));
			Assert.assertEquals(true, articleTitle.isDisplayed());
			

			WebElement articleTimeStamp = wbDrv.findElement(By.cssSelector(".noprint"));
			Assert.assertEquals(true, articleTimeStamp.isDisplayed());
			

			WebElement articleText = wbDrv.findElement(By.cssSelector(".article-index>li>p"));
			Assert.assertEquals(true, articleText.isDisplayed());
			
			
		}
		
	  }
}
