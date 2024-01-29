package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeGetGetTittlegeCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		String s = driver.getTitle();
		if(s!="") {
			System.out.println("tittle is"+s);
			if(s.length()<60) {
				System.out.println("valid");
			   }else {
				   System.out.println("not valid");
			   }
		}else {
			System.out.println("not a tittle");
		}
		driver.findElement(By.linkText("Sell")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.partialLinkText("Amazon miniTV")).click();
		String s1= driver.getCurrentUrl();
		System.out.println("url is "+s1);
		driver.get("http://www.amazon.in/minitv");
		driver.findElement(By.partialLinkText("Web Series")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.linkText("Comedy")).click();
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
	}

}
