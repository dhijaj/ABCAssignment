package test;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utilities.ABCCommon;

public class lastProgram extends ABCCommon {

	@Test
	public void LoadABRadio() throws InterruptedException  {
	wbDrv.get(dABCRadio);
	
	List<WebElement> programCarousal = wbDrv.findElements(By.cssSelector(".at-a-glance>li"));
	int programCarousalCount = programCarousal.size();
	System.out.println("program Carousal Count: " + programCarousalCount);
	
	getElement("rightArrow").click();
	Thread.sleep(2000);
	getElement("rightArrow").click();
	Thread.sleep(2000);

	getElement("lastProgram").click();
	
	
}
}