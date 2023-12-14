package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	WebDriver d;
	Webelements w=new Webelements();
	
@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}
@Given(":Open Url {string}")
public void Open_Url(String url) throws Exception {
	d.get(url);
	Thread.sleep(5000);
}
@When(":Enter valid User Name {string}")
public void enter_valid_user_name(String user) {
    d.findElement(By.xpath(w.UserName)).sendKeys(user);
	
}

@When(":Enter valid Password {string}")
public void enter_valid_password(String pwd) {
	 d.findElement(By.xpath(w.password)).sendKeys(pwd);
	
	
}

@When(":Click on Submit button")
public void click_on_submit_button() {
	 d.findElement(By.xpath(w.Loginbtn)).click();
	
}

@Then(":Check Dashboard screen should display")
public void check_dashboard_screen_should_display() {
   WebElement z=d.findElement(By.xpath(w.Dashboard));
   if(z.isDisplayed()){
	 System.out.println("User Login Successfully");  
   }
   else System.out.println("User did not Login");
	
	
}

}
