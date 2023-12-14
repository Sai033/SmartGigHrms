package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class AddLeave {
	private WebDriver d;

	Webelements w=new Webelements();
	String HolidayName="Election";
@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}
	@When(":Navigate to Myrequests>>Leave sub module")
	public void navigate_to_myrequests_leave_sub_module() throws Exception {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(10000);
		Actions act =new Actions(d);
	   WebElement Menu=d.findElement(By.xpath(w.menu));
	   act.moveToElement(Menu).perform();;
	   Thread.sleep(5000);
	   d.findElement(By.xpath(w.MyRequests)).click();
	   d.findElement(By.xpath(w.LeaveIcon)).click();
	  	   
	   
		
	}

	@When(":Click on Add leave")
	public void click_on_add_leave() {
	    
		 d.findElement(By.xpath(w.LeaveIcon)).click();
		   d.findElement(By.xpath(w.addLeaveReq)).click();
		   
		
	}

	@When(":Print the Balance Casual Leaves")
	public void print_the_balance_casual_leaves() throws Exception {
    		 d.findElement(By.xpath(w.leaveBalanceIcon)).click();
		   Thread.sleep(3000);
		   String casualLeaves=d.findElement(By.xpath(w.casualLeaveBalance)).getText();
		   Thread.sleep(2000);
		   System.out.println(casualLeaves);
		   d.findElement(By.xpath(w.balanceiconclose)).click();
		   Thread.sleep(10000);
		   
	}

	@When(":Enter all required details related to Leave and click on save button")
	public void enter_all_required_details_related_to_leave_and_click_on_save_button() throws Exception {
		       Thread.sleep(5000);
			   WebElement leaveType=d.findElement(By.xpath(w.leaveType));
			   Select s1=new Select(leaveType);
			   s1.selectByVisibleText("Casual Leave");
			   d.findElement(By.xpath(w.startdate)).click();
			   d.findElement(By.xpath(w.Sdate)).click();
			   d.findElement(By.xpath(w.endDate)).click();
			   d.findElement(By.xpath(w.Edate)).click();
			   d.findElement(By.xpath(w.chargeHandover)).click();
			   d.findElement(By.xpath(w.textArea)).sendKeys("Test");
			   d.findElement(By.xpath(w.leaveSave)).click();
			   		
	}

	
	
}
