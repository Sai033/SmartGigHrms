package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {

	
	 private static WebDriver d;

	    public static WebDriver getDriver() {
	    	 if (d == null) {
	          d = new FirefoxDriver();
	    	 }
	        return d;
	    }
	    public static void quitDriver() {
	        if (d!= null) {
	            d.quit();
	            d = null;
	        }
	    }

	   
}
