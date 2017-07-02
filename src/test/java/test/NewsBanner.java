package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.ABCCommon;


public class NewsBanner extends ABCCommon{

@Test
  public void NewsBannerVerification() {
	System.out.println("checking News Banner"); 
	Assert.assertEquals(true, isElementPresent("Header"));
	Assert.assertEquals(true, isElementPresent("Banner"));
	
  }
}
