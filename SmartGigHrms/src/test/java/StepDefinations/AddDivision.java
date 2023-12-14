package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class AddDivision {

	public class AddSite {
		private WebDriver d;
		Webelements w=new Webelements();

	@Before
	public void Launching_Browser() {
		d=Webdriver.getDriver();
	}
	
@When(":Click on Division icon")
public void click_on_division_icon() throws Exception {
	Thread.sleep(2000);
	 d.findElement(By.xpath(w.DivisionIcon)).click();	
}

@When(":Click on Add Division")
public void click_on_add_division() {
	 d.findElement(By.xpath(w.AddDivision)).click();
}

@When(":Enter all division required details and click on save button")
public void enter_all_division_required_details_and_click_on_save_button() {
	d.findElement(By.xpath(w.Divisionname)).sendKeys("DivisionName");
	d.findElement(By.xpath(w.DivisionCode)).sendKeys("DivisionCode");
	d.findElement(By.xpath(w.DivisionSave)).click();
}





	}
}
