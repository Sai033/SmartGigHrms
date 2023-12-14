package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class AddSite {
	private WebDriver d;
    String userId="1200";
	Webelements w=new Webelements();

@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}

@When(":Click on Sites icon")
public void click_on_sites_icon() {
    d.findElement(By.xpath(w.SitesIcon)).click();
	
}

@When(":Click on Add Site")
public void click_on_add_site() throws Exception {
   d.findElement(By.xpath(w.AddSite)).click();
   Thread.sleep(5000);
   	
}

@When(":Enter all required details and click on save button")
public void enter_all_required_details_and_click_on_save_button() throws Exception {
   d.findElement(By.xpath(w.Sitename)).sendKeys("SiteName");
   Thread.sleep(2000);
   WebElement siteType=d.findElement(By.xpath(w.siteType));
	Select s1=new Select(siteType);
	s1.selectByVisibleText("Manufacturing");
	
	 WebElement division=d.findElement(By.xpath(w.Diviion));
		Select s2=new Select(division);
		s2.selectByVisibleText("API (API)");
		d.findElement(By.xpath(w.moveDiv)).click();
		d.findElement(By.xpath(w.SiteSave)).click();
}

}
