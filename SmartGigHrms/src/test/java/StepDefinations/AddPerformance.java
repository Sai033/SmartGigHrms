package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class AddPerformance {
	BaseClass b=new BaseClass();
	private WebDriver d;
    String userId="1200";
	Webelements w=new Webelements();

@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}
//@When(":Enter valid Users Name {string}")
//public void Enter_valid_Users_Name(String username) {
//	b.SendKeys(w.firstName, "admin", "username");
//}









@When(":Navigate to HR>>Review cycle")
public void navigate_to_hr_review_cycle() throws Exception {
	  Thread.sleep(5000);
	  Actions act=new Actions(d);
   WebElement menu=d.findElement(By.xpath(w.menu));
   Thread.sleep(3000);
   act.moveToElement(menu).perform();;
   Thread.sleep(5000);
   d.findElement(By.xpath(w.HR)).click();
   Thread.sleep(5000);
	d.findElement(By.xpath(w.reviewCycleicon)).click();
	  Thread.sleep(5000);
    
}

@When(":Add review cycle period")
public void add_review_cycle_period() {
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   d.findElement(By.xpath(w.addreviewCycle)).click();
   d.findElement(By.xpath(w.year)).sendKeys("2023");
 System.out.println(d.getWindowHandle().toString());
   d.findElement(By.xpath(w.startDatePick)).click();
   d.findElement(By.xpath(w.startdatePick)).click();
   d.findElement(By.xpath(w.performanceEndDate)).click();
 System.out.println(d.getWindowHandle().toString());
  WebElement year=d.findElement(By.xpath(w.endyearpick));
  Select s1=new Select(year);
  s1.selectByVisibleText("2024");
  WebElement mnth=d.findElement(By.xpath(w.endmnthPick ));
  Select s2=new Select(mnth);
  s2.selectByVisibleText("Jun");
  d.findElement(By.xpath(w.endDatePick)).click();;
  d.findElement(By.xpath(w.reviewSave)).click();
  
}

@When(":Navigate to Employee")
public void navigate_to_employee() throws Exception {
   d.findElement(By.xpath(w.EmployeeIcon)).click();
   Thread.sleep(5000);
	
}

@When(":Click on employeeCode hyperlink and click on Performance")
public void click_on_employee_code_hyperlink_and_click_on_performance() {
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.findElement(By.xpath(w.EmployeeIcon)).click();
    d.findElement(By.xpath(w.performancebtn)).click();
}

@When(":Add the Performance")
public void add_the_performance() {
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   d.findElement(By.xpath(w.addPerformance)).click();
   WebElement reviewCycle=d.findElement(By.xpath(w.ReviewCycle));
   Select s1=new Select(reviewCycle);
   s1.selectByVisibleText("");
   WebElement reviewer=d.findElement(By.xpath(w.reviewer));
   Select s2=new Select(reviewer);
   s2.selectByVisibleText("A Anusha - 1206");
   d.findElement(By.xpath(w.performanceSave)).click();
   
   
   }

@When(":Add the Performance goals")
public void add_the_performance_goals() {
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    d.findElement(By.xpath(w.goalbtn)).click();
    for (int i=0;i<=2;i++) {
    	String a[]= {"Behaviour","Technical","Leadership"};
    d.findElement(By.xpath(w.goalTitle)).sendKeys(a[i]);
    String b[]= {"20","60","20"};
    d.findElement(By.xpath(w.weight)).sendKeys(b[i]);
    String goaltype[]= {"Behaviours","Technical Skill","LeaderShip"};
    WebElement goalType=d.findElement(By.xpath(w.goalType));
    Select s1=new Select(goalType);
    s1.selectByVisibleText(goaltype[i]);
    d.findElement(By.xpath(w.goalSave)).click();
}
}

@When(":Click on Set Final goal")
public void click_on_set_final_goal() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When(":Enter Appraise comments based on questions")
public void enter_appraise_comments_based_on_questions() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When(":Enter the Appraiser comments")
public void enter_the_appraiser_comments() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When(":Enter the marks for employee based on Gole type")
public void enter_the_marks_for_employee_based_on_gole_type() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
