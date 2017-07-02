package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.ABCCommon;

public class imageGallery extends ABCCommon {
	
	  @Test
	  public void ImageGalleryTest() throws InterruptedException {
	
		wbDrv.get(dimageGalleryUrl);
		Assert.assertEquals(true, isElementPresent("MainImageInGallery"));
		
		List<WebElement> imageGallery = wbDrv.findElements(By.cssSelector(".lSPager.lSGallery>li"));
		int galleryCount = imageGallery.size();
		System.out.println("Gallery Count: " + galleryCount);
		
		
		for(int i=1;i<=galleryCount;i++){
			
			
			WebElement articleTitle = wbDrv.findElement(By.cssSelector(".lSPager.lSGallery>li>a>img"));
			Assert.assertEquals(true, articleTitle.isDisplayed());
			
			
			
			
		}
		
		
		
	}
}
