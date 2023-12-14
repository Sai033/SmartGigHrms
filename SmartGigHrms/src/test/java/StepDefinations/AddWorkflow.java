package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class AddWorkflow {
	public class AddSite {
		private WebDriver d;
		Webelements w=new Webelements();

	@Before
	public void Launching_Browser() {
		d=Webdriver.getDriver();
	}	
	

@When(":Click on WorkFlow icon")
public void click_on_work_flow_icon() {
    d.findElement(By.xpath(w.workflowIcon)).click();
	
}

@When(":Click on Add New workflow")
public void click_on_add_new_workflow() {
   d.findElement(By.xpath(w.addNewWorkflow)).click();
   
}

@When(":Enter all workflow required details and click on save button")
public void enter_all_workflow_required_details_and_click_on_save_button() {
 d.findElement(By.xpath(w.wfname)).sendKeys("workflowname");
 WebElement entityType=d.findElement(By.xpath(w.entityType));
	Select s1=new Select(entityType);
	s1.deselectByVisibleText("Leaves");
	 WebElement entitySubType=d.findElement(By.xpath(w.entitysubType));
		Select s2=new Select(entitySubType);
		s2.deselectByVisibleText("Leave approval");
		
		 WebElement siteId=d.findElement(By.xpath(w.siteId));
			Select s3=new Select(siteId);
			s3.deselectByVisibleText("HO");
			d.findElement(By.xpath(w.wfSave)).click();
			
		
	
}
}
}
