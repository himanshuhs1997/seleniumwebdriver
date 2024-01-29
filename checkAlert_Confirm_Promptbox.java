package WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class checkAlert_Confirm_Promptbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.shivaconceptsolution.com/backupmain/test3.html");
		
   		//alert
		
		driver.findElement(By.cssSelector("input[value=alert]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
    		//confirm
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=confirm]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
    		//prompt
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=prompt]")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Automation");
		driver.switchTo().alert().accept();
		
		
//==============================================================		
		
		
		
		
		
		
		
		
		
	}

}
