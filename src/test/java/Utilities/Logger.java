package Utilities;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.Utils;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class Logger {
    
    public enum As {
        INFO, WARNING, PASSED, FAILED
    }

    public static void log(String stepDesc, As as) {

        switch (as) {
        case INFO:
            ATUReports.add(stepDesc, LogAs.INFO, null);
            break;
        case FAILED:
            ATUReports.add(stepDesc, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
            break;
        case PASSED:
            ATUReports.add(stepDesc, LogAs.PASSED, null);
            break;
        case WARNING:
            ATUReports.add(stepDesc, LogAs.WARNING, null);
            break;
        default:
            break;
        }

    }

    public static void log(String stepDesc, String inputVal, As as) {

        switch (as) {
        case INFO:
            ATUReports.add(stepDesc, inputVal, LogAs.INFO, null);
            break;
        case FAILED:
            ATUReports.add(stepDesc, inputVal, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
            break;
        case PASSED:
            ATUReports.add(stepDesc, inputVal, LogAs.PASSED, null);
            break;
        case WARNING:
            ATUReports.add(stepDesc, inputVal, LogAs.WARNING, null);
            break;
        default:
            break;
        }

    }
    public static void log(String stepDesc, String expVal, String actualVal, As as) {

        switch (as) {
        case INFO:
            ATUReports.add(stepDesc,expVal, actualVal, LogAs.INFO, null);
            break;
        case FAILED:
            ATUReports.add(stepDesc,expVal, actualVal, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
            break;
        case PASSED:
            ATUReports.add(stepDesc,expVal, actualVal, LogAs.PASSED, null);
            break;
        case WARNING:
            ATUReports.add(stepDesc,expVal, actualVal, LogAs.WARNING, null);
            break;
        default:
            break;
        }

    }
    public static void log(String stepDesc, String inputval, String expVal, String actualVal, As as) {

        switch (as) {
        case INFO:
            ATUReports.add(stepDesc,inputval,expVal, actualVal, LogAs.INFO, null);
            break;
        case FAILED:
            ATUReports.add(stepDesc,inputval,expVal, actualVal, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
            break;
        case PASSED:
            ATUReports.add(stepDesc,inputval,expVal, actualVal, LogAs.PASSED, null);
            break;
        case WARNING:
            ATUReports.add(stepDesc,inputval,expVal, actualVal, LogAs.WARNING, null);
            break;
        default:
            break;
        }

    }
    public static void setIndexPageDescription(String pageDesc) {

        ATUReports.indexPageDescription = pageDesc;
    }

    public static void setAuthorInfo(String authorName, String version) {

        ATUReports.setAuthorInfo(authorName, Utils.getCurrentTime(), version);

    }

    public static void runDesc(String runDesc) {
        
        ATUReports.currentRunDescription = runDesc;
    }
}