package WebDriver;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluentexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    .withTimeout(Duration.ofSeconds(10))
	    .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver,WebElement>(){
            	public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.xpath("//*[@id='demo']"));
				String s= element.getText();
				if(s.equals("Software Testing Material - DEMO PAGE")) {
					System.out.println(s);
					return element;
				}else {
					System.out.println("fluent wait failed");
				
				return null;
				}
			}
		});     
		
		
		
//========================================================================================		
		
	
		
		
		
		
		
	}

}
