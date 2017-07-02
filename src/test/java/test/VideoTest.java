package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ABCCommon;

public class VideoTest extends ABCCommon {

	
	@Test
	  public void VideoPlayerTest() throws InterruptedException {
	
		wbDrv.get("http://www.abc.net.au/news/2017-02-09/weatherill-promises-to-intervene-dramatically/8254908");
	
		
		WebElement wplayButton = getElement("playButton");
		Assert.assertEquals(true, wplayButton.isDisplayed());
		getElement("playButton").click();
		
		wbDrv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement wpauseButton = getElement("pauseButton");
		Assert.assertEquals(true, wpauseButton.isDisplayed());
		getElement("pauseButton").click();
	
		
		
		
	}
}