package WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// google--- element to be Clickable

/*		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/ncr");
		driver.findElement(By.name("q")).sendKeys("selenium Webdriver example"+Keys.ENTER);
		WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.className("LC20lb")));
		System.out.println(ele.getText());           
*/
//====================================================================================		

		// Gmail login------visibility of element located

	/*	System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
     	driver.manage().window().maximize();
		driver.get("https://gmail.com");
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("identifier")).sendKeys("himanshusharma0805@gmail.com"+Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement p = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("whsOnd")));
		p.sendKeys("sharma123");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();     */

//==================================================================================		

		// ebay ----- visibility of element located
	/*	System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.ebay.com/");
	
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    Stopwatch watch = null;
	    try {
	    	watch = Stopwatch.createStarted();
	    	WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Electronics")));
	         ele.click();
	    }catch (Exception e)
	    {
	    	watch.stop();
	    	System.out.println(e);
	    	System.out.println(watch.elapsed(TimeUnit.SECONDS)+"seconds");
	    }

          */

//=========================================================================================

		// shiva concept----- alert is present
	/*	
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shivaconceptsolution.com/backupmain/test3.html");

//		//alert
		driver.findElement(By.cssSelector("input[value=alert]")).click();
		String s = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(s);

//		//confirm
		driver.findElement(By.cssSelector("input[value=confirm]")).click();
		String s1 = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(s1);

//		//prompt
		driver.findElement(By.cssSelector("input[value=prompt]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys("hi how are you");
		String s2 = driver.switchTo().alert().getText();
		System.out.print(s2);
		driver.switchTo().alert().accept();         */

//================================================================================	      

		// Element to be selected
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in/index.php");
		Select s= new Select(driver.findElement(By.name("ddlcat")));
		s.selectByIndex(2);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(By.id("subcat")));
		
		
	
	}
}
