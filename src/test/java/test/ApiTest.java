package test;



	import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	import static org.hamcrest.Matchers.equalTo;
import Utilities.ABCCommon;

import static com.jayway.restassured.RestAssured.*;
	
	public class ApiTest extends ABCCommon {
		
		@Test(priority=1)
		public void API_Get(){
			String tapiUrl = "http://"+dapiUrl+"ppJj0E8g2R.json";
			System.out.println("apiUrl : " + tapiUrl);
			
			given().
			when().
			get(tapiUrl).
			then().statusCode(200).
			body("entity", equalTo("Program")).
			body("arid",equalTo("ppJj0E8g2R")).
			body("title",equalTo("Mornings")).
			body("mini_synopsis",equalTo("Mornings presents local news and issues, talking with everyday folk about current issues")).
			body("short_synopsis",equalTo("Mornings presents local news and issues, talking with everyday folk about current issues.")).
			body("medium_synopsis",equalTo("Mornings presents local news and issues, talking with everyday folk about current issues. Local stories and issues are at the heart of the Mornings program, bringing you fresh local and regional information - including your opportunity to ask direct questions to the ACT Chief Minster each Friday")).
			body("created_utc",equalTo("2014-10-09T05:01:49+0000")).
			body("last_updated_utc",equalTo("2017-04-28T06:32:56+0000")).
			body("service_airport_code",equalTo(null));
			
		}

		@Test(enabled =false)

		//@Test(priority=2, dataProvider = "data-provider2")
		public void API_Get1(String environment){
			String tapiUrl1 = "http://"+environment+dapiUrl+"ppJj0E8g2R.json";
			System.out.println("apiUrl : " + tapiUrl1);
			
			given().
			when().
			get(tapiUrl1).
			then().statusCode(200);
			
			
		}
		
		
		
		
		@Test(priority=2, dataProvider = "data-provider")
		public void API_Get3(String programName){
			String tapiUrl1 = "http://"+dapiUrl+programName;
			System.out.println("apiUrl : " + tapiUrl1);
			
			given().
			when().
			get(tapiUrl1).
			then().statusCode(200);
			
			
		}
		
		
		
		@DataProvider(name = "data-provider")
		public Object[][] dataProviderMethod() {
			return new Object[][] { { "ppJj0E8g2R.json" }, { "ppxa2Amj2b.json" } };
		}
		@DataProvider(name = "data-provider2")
		public Object[][] dataProviderMethod2() {
			return new Object[][] { { "test-" }, { "stage-" } };
		}

	}
