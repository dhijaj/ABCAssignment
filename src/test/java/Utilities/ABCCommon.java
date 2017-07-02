package Utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Utilities.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import atu.testng.reports.ATUReports;
 
public class ABCCommon extends BrowserSetup {
	
	static String filePath = null;
    static String line = "";
    static BufferedReader br = null;
//    static String stypeofenv="prod";

    
    
    public static Object[][] getTestData(String filePath) throws IOException {

        List<List<String>> rows = new ArrayList<List<String>>();
        try {
            br = new BufferedReader(new FileReader(filePath));

            while ((line = br.readLine()) != null) {
                if (!line.startsWith("#")) {
                    rows.add(Arrays.asList(line.split(",")));
                }
            }

            br.close();
        } catch (FileNotFoundException e) {

            log("Unable to find file at location ",
                    filePath,
                    null,
                    e.getMessage(),
                    As.FAILED);
        }

        Object[][] testData = new Object[rows.size()][];

        for (int i = 0; i < rows.size(); i++) {
            testData[i] = rows.get(i).toArray();
        }

        return testData;
    }

    public static WebElement getElement(String elementKey) {

        String[] value = null;
        try {
            value = OR.getProperty(elementKey).split(":");
        } catch (NullPointerException e) {
            System.out.println(elementKey + "declaration is not found in the OR.properties file");
            return null;
        }
        try {
            switch (value[value.length - 1].toUpperCase()) {
            case "NAME":
                return wbDrv.findElement(By.name(value[0]));
            case "XPATH":
                return wbDrv.findElement(By.xpath(value[0]));
            case "CSS":
                return wbDrv.findElement(By.cssSelector(value[0]));
            case "ID":
                return wbDrv.findElement(By.id(value[0]+":"+value[1]));
            default:
                return null;
            }
        } catch (Throwable t) {
            log("Trying to find the element:", elementKey, null, t.getMessage(), As.FAILED);
            return null;
        }

    }

    public static boolean isElementPresent(String elementKey) {
        String[] value = null;
        try {
            value = OR.getProperty(elementKey).split(":");
        } catch (NullPointerException e) {
            System.out.println(elementKey + "declaration is not found in the OR.properties file");
            return false;
        }

        try {
            switch (value[value.length - 1].toUpperCase()) {
            case "NAME":
                wbDrv.findElement(By.name(value[0]));
                return true;
            case "XPATH":
                wbDrv.findElement(By.xpath(value[0]));
                return true;
            case "ID":
                wbDrv.findElement(By.id(value[0]+":"+value[1]));
                return true;
            default:
                return false;
            }
        } catch (Throwable e) {
            return false;
        }
    }
    
    public static By findBy(String name) {

        String[] value = null;
        try {
            value = OR.getProperty(name).split(":");
        } catch (NullPointerException e) {
            System.out.println(name + "declaration is not found in the OR.properties file");
            return null;
        }
        try {
            switch (value[1].toUpperCase()) {
            case "NAME":
                return By.name(value[0]);
            case "XPATH":
                return By.xpath(value[0]);
            default:
                return null;
            }
        } catch (Throwable t) {
            log("Trying to find the element:", name, null, t.getMessage(), As.FAILED);
            return null;
        }

    }
    


}
