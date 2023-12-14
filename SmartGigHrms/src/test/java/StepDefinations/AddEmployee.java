package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class AddEmployee {
	private WebDriver d;
    String userId="1200";
	Webelements w=new Webelements();

@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}
	@When(":Navigate to HR>>Employee")
	public void navigate_to_hr_employee() throws Exception {
		Thread.sleep(10000);
		Actions act=new Actions(d);
	    WebElement menu=d.findElement(By.xpath(w.menu));
		act.moveToElement(menu).perform();
		Thread.sleep(4000);
		d.findElement(By.xpath(w.HR)).click();
		Thread.sleep(3000);
			}

	@When(":Click on Add Employee")
	public void click_on_add_employee() throws Exception {
	    d.findElement(By.xpath(w.addEmp)).click();
	    Thread.sleep(5000);
	}

	@When(":Enter all required details related to Employee")
	public void enter_all_required_details_related_to_employee() throws Exception {
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  d.findElement(By.xpath(w.empCode)).sendKeys("eqwdas");
	  d.findElement(By.xpath(w.biometricCode)).sendKeys("eqwdas");
	  WebElement salutation=d.findElement(By.xpath(w.salutation));
	  Select s1=new Select(salutation);
	  s1.selectByVisibleText("Mr");
	  d.findElement(By.xpath(w.firstName)).sendKeys("Radha");
	  d.findElement(By.xpath(w.surname)).sendKeys("Krishna");
//	  WebElement gender=d.findElement(By.xpath(w.gender));
//	  Select s2=new Select(gender);
//	  s2.deselectByValue("Male");
	  d.findElement(By.xpath(w.DOB)).sendKeys("10/10/2000");
	  Thread.sleep(5000);
	  WebElement bloodgroup=d.findElement(By.xpath(w.bloodGroup));
	  Select s3=new Select(bloodgroup);
	  s3.selectByVisibleText("A +ve");
	  d.findElement(By.xpath(w.positionDropdown)).click();
	  Thread.sleep(2000);
	  d.findElement(By.xpath(w.position)).click();
	  Thread.sleep(2000);
	  WebElement empType=d.findElement(By.xpath(w.employeeType));
	  Select s4=new Select(empType);
	  s4.selectByVisibleText("Company Staff");
	  WebElement status=d.findElement(By.xpath(w.status));
	  Select s5=new Select(status);
	  s5.selectByVisibleText("Confirmed");
	  d.findElement(By.xpath(w.statuseffictivedate)).sendKeys("10/10/2020");
	  d.findElement(By.xpath(w.dateOfJoin)).sendKeys("10/10/2023");
	  d.findElement(By.xpath(w.pfEligible)).click();
	  d.findElement(By.xpath(w.ptEligible)).click();
	  d.findElement(By.xpath(w.earnedleaveEligible)).click();
	  d.findElement(By.xpath(w.NPFEligible)).click();
	  d.findElement(By.xpath(w.SystemUser)).click();
	  
	  }

	@When(":Click on empSave button")
	public void click_on_emp_save_button() {
	   d.findElement(By.xpath(w.empSave)).click();
	}
}
