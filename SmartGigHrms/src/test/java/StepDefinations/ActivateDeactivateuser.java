package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class ActivateDeactivateuser {
	private WebDriver d;
    String userId="1200";
	Webelements w=new Webelements();
	String HolidayName="Election";
@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}


@When(":Search user and Deactivate the User")
public void search_user_and_deactivate_the_user() {
    d.findElement(By.xpath(w.userSearch)).sendKeys(userId);
    d.findElement(By.xpath(w.userSearchBtn)).click();
    d.findElement(By.xpath(w.allRadiostatusbtn)).click();
    d.findElement(By.xpath(w.DeactivateIcon)).click();
    }

@Then(":Check user is Deactivated")
public void check_user_is_deactivated() {
	WebElement z=d.findElement(By.xpath(w.activateIcon));
	if(z.isDisplayed()) {
		System.out.println("User is Deactivated");
	}
	else System.out.println("user is not Deactivated");
	
}

@When(":Search user and Activate the User")
public void search_user_and_activate_the_user() {
	   d.findElement(By.xpath(w.userSearch)).sendKeys(userId);
	    d.findElement(By.xpath(w.userSearchBtn)).click();
	    d.findElement(By.xpath(w.allRadiostatusbtn)).click();
         d.findElement(By.xpath(w.activateIcon)).click();
}

@Then(":Check user is Activated")
public void check_user_is_activated() {
	WebElement z=d.findElement(By.xpath(w.DeactivateIcon));
	if(z.isDisplayed()) {
		System.out.println("User is activated");
	}
	else System.out.println("user is not Deactivated");
	
}
	
}

