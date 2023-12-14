package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.cucumber.java.Before;

public class BaseClass {
	private WebDriver d;
    String userId="1200";
	Webelements w=new Webelements();

@Before
public void Launching_Browser() {
	d=Webdriver.getDriver();
}

public void SendKeys(String xpath,String data,String fieldname) {
	//WebDriverWait w=new WebDriverWait(d, Duration.ofSeconds(10));
	//w.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	WebElement z=d.findElement(By.xpath(xpath));
	//w.until(ExpectedConditions.visibilityOf(z));
	z.sendKeys(data);
}

}
