package StepDefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddHoliday {
	private WebDriver d;

	Webelements w=new Webelements();
	String HolidayName="Election";
@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}	

@When(":Navigate to HR>>Holiday")
public void navigate_to_hr_holiday() throws Exception {
	  Thread.sleep(5000);
	  Actions act=new Actions(d);
   WebElement menu=d.findElement(By.xpath(w.menu));
   Thread.sleep(3000);
   act.moveToElement(menu).perform();;
   Thread.sleep(5000);
   d.findElement(By.xpath(w.HR)).click();
   Thread.sleep(5000);
	d.findElement(By.xpath(w.Holoiday_Icon)).click();
	  Thread.sleep(5000);
	  	
}

@When(":Click on Add Holiday")
public void click_on_add_holiday() {
   d.findElement(By.xpath(w.Add_Holiday)).click();
   	
}

@When(":Enter all required details")
public void enter_all_required_details() throws Exception {
	  Thread.sleep(5000);
	  d.findElement(By.xpath(w.HolidayName)).sendKeys(HolidayName);
	  d.findElement(By.xpath(w.HolidayDate)).sendKeys("05/12/2023");
	  Thread.sleep(2000);
	
}

@When(":Click on Submit_Holiday button")
public void click_on_submit_holiday_button() {
    d.findElement(By.xpath(w.Save_Holiday)).click();
	
	
}

@When(":Click on Ok button in Allert")
public void click_on_ok_button_in_allert() throws Exception {
   Thread.sleep(5000);
   Alert a=d.switchTo().alert();
   a.accept();
   Thread.sleep(2000);
   
	
	
}

@Then(":Check Holiday should be added")
public void check_holiday_should_be_added() {
    WebElement z=d.findElement(By.xpath("//td[text()='"+HolidayName+"']"));
    if(z.isDisplayed()) {
    	System.out.println("Holiday is created successfully");
    }
    else System.out.println("Holiday is not created");
	
	
}
}
