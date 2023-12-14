package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class AddDelete_Admin {
	private WebDriver d;
    String userId="1200";
	Webelements w=new Webelements();

@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}

@When(":Click on Administration")
public void click_on_administration() {
    d.findElement(By.xpath(w.Anministratorsbtn)).click();
    	
}

@When(":Click on Add Admin")
public void click_on_add_admin() {
   d.findElement(By.xpath(w.AddAdmin)).click();
   	
}

@When(":Search User")
public void search_user() throws Exception {
  d.findElement(By.xpath(w.AdminSearch)).sendKeys("1414");
  d.findElement(By.xpath(w.adminSearechbtn)).click();
  Thread.sleep(3000);	
}

@When(":Check the radio button and click on Save button")
public void check_the_radio_button_and_click_on_save_button() {
   d.findElement(By.xpath(w.Radiobtn)).click();
   d.findElement(By.xpath(w.AdminSavebtn)).click();
		
}
@And (":Delete the user as Admin")
public void Delete_the_user_as_Admin() {
	d.findElement(By.xpath(w.DeleteAdmin)).click();
}

}
