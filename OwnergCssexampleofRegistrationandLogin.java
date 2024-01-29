package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnergCssexampleofRegistrationandLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// registration 
	/*	
		driver.get("https://eroomrent.in/ownerreg.php");
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("himanshu");
		driver.findElement(By.cssSelector("input[type=number]")).sendKeys("8545652535");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("asdf@852");
		driver.findElement(By.cssSelector("input[name=txtConfirmPassword]")).sendKeys("asdf@852");
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("himanshu1181@gmail.com");
		driver.findElement(By.cssSelector("input[type=submit]")).click();
	*/
		
//============================================================================		
		
	/*	
		//login
		
	//	driver.navigate().refresh();
	//	Thread.sleep(2000);
		driver.navigate().to("https://eroomrent.in/ownerlogin.php");
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("himanshu1181@gmail.com");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("asdf@852");
		driver.findElement(By.cssSelector("input[type=submit")).click();
		driver.findElement(By.cssSelector("a[href='logout.php']")).click();
		
	*/	
	}

}
