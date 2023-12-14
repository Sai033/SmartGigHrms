package StepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewAssignedRoles {
	private WebDriver d;
    String userId="1028";
	Webelements w=new Webelements();
	List<WebElement> element;
@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}
	
@When(":Click on Ellipsis and click on view assigned roles")
public void click_on_ellipsis_and_click_on_view_assigned_roles() {
	   d.findElement(By.xpath(w.userSearch)).sendKeys(userId);
	    d.findElement(By.xpath(w.userSearchBtn)).click();
	   d.findElement(By.xpath(w.ellipsisIcon)).click();
	   d.findElement(By.xpath(w.ViewAssignedRoles)).click();
	  
}

@Then(":Print the Role names")
public void print_the_role_names() throws Exception {
	Thread.sleep(3000);
	element=d.findElements(By.xpath(w.ListRoles));
	Thread.sleep(3000);
    for(WebElement w1 : element) {
    	System.out.println(w1.getText().toString());
    }
	
}
}
