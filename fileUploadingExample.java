package WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUploadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.name("uploadfile_0")).sendKeys("D://MY PLAN//D3D elevation 1.pdf");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
   
		
//=================================================================================
		/*
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.findElement(By.name("uploadfile_0")).sendKeys("D://MY PLAN//D3D elevation 1.pdf");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("res")));
	    String t= driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
	    if (t!="") {
	    	System.out.println("File Uploading successful"+t);
	    }else {
	    	System.out.println("problem in file uploading");
	    }
	*/
	}

}
