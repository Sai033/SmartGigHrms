package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class AssigningRoles {

	private WebDriver d;
    String userId="1200";
	Webelements w=new Webelements();

@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}
	
	@When(":Add role to user")
	public void Add_role_to_user() throws Exception {
		Thread.sleep(5000);
		d.findElement(By.xpath(w.AddTeam)).click();
		Thread.sleep(2000);
		WebElement team=d.findElement(By.xpath(w.Team));
		Select s1=new Select(team);
		s1.selectByVisibleText("HR");
		
		WebElement role=d.findElement(By.xpath(w.Role));
		Select s2=new Select(role);
		s2.selectByVisibleText("Testing");
		d.findElement(By.xpath(w.RoleSave)).click();
	}
}
