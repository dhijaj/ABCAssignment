package Utilities;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import atu.testng.reports.ATUReports;

public class BrowserSetup extends Logger{

	    public static WebDriver wbDrv = null;
	    public static Properties OR = null;
	    public static FileInputStream fp = null;
	    public static String durl  = null;
	    public static String dvideoUrl  = null;
	    public static String dimageGalleryUrl  = null;
	    public static String dapiUrl=null;
	    
	    @Parameters({ "browser", "runDesc","url" , "videoUrl", "imageGalleryUrl", "apibaseurl"})
	    @BeforeSuite
	    public void setup( String dBrowser, String runDesc, String url, String videoUrl, String imageGalleryUrl, String apibaseurl)
	            throws IOException, AWTException {

	        // Loading all paths to the elements from Object Repository property file
	        OR = new Properties();
	        fp = new FileInputStream(System.getProperty("user.dir") + "/target/test-classes/UIMaps/web.properties");
	        OR.load(fp);
	        
	       
			System.out.println("Website under test: "+url); 
	        durl=url;
	        dvideoUrl= videoUrl;
	        dimageGalleryUrl= imageGalleryUrl;
	        dapiUrl=apibaseurl;
	        
	        
	        //Browser Selection
	        if(dBrowser.equalsIgnoreCase("firefox")) {
	        	wbDrv = new FirefoxDriver();
	            }

	            else if (dBrowser.equalsIgnoreCase("chrome")) { 
	            	
	            {System.setProperty("webdriver.chrome.driver","./src/test/java/Drivers/chromedriver");}
	            wbDrv = new ChromeDriver();        
	             }

	          
	        wbDrv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        ATUReports.setWebDriver(wbDrv);
	       
	     
	        //runDesc(runDesc);
	    }


	   // @AfterSuite
	    public static void tearDown() {
	       wbDrv.quit();
	    }
}
