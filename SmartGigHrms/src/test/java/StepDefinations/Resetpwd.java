package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Resetpwd {

	WebDriver d;
	Webelements w=new Webelements();
	String userId="b.balu";
@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}	

@When(":Navigate to Admin module")
public void navigate_to_admin_module() throws Exception {
	Thread.sleep(8000);
	Actions act=new Actions(d);
	WebElement menu=d.findElement(By.xpath(w.menu));
	act.moveToElement(menu).perform();
	Thread.sleep(4000);
	d.findElement(By.xpath(w.AdminModule)).click();
	Thread.sleep(3000);
	
}

@When(":Click on Ellipsis and click on Reset password")
public void click_on_ellipsis_and_click_on_reset_password() throws Exception {
   d.findElement(By.xpath(w.userSearch)).sendKeys(userId);
   d.findElement(By.xpath(w.userSearchBtn)).click();
   Thread.sleep(3000);
   d.findElement(By.xpath(w.ellipsisIcon)).click();
   d.findElement(By.xpath(w.resetPwd)).click();
   Thread.sleep(2000);
	
}

@When(":Logout")
public void logout() throws Exception {
	Thread.sleep(2000);
	Actions act=new Actions(d);
 WebElement menu=d.findElement(By.xpath(w.Logoutmenu));  
	act.moveToElement(menu).perform();
	Thread.sleep(3000);
	d.findElement(By.xpath(w.Logoutbtn)).click();
	
}



}
