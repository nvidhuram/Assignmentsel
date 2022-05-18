package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.id("password")).sendKeys("Tuna@123");
		
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(20000);
		
		WebElement element =  driver.findElement(By.xpath("//div//lightning-primitive-icon/*[@class='slds-icon slds-icon_x-small']"));
		element.click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'New Lead')]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys("Lname");
		
		driver.findElement(By.xpath("(//input[@class=\" input\"])[3]")).sendKeys("companyname");
		
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();

	}

}
