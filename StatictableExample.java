package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatictableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //static
		/*
		  System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  driver.get("file:///D:/testing/html/statictableexample.html");
		  List<WebElement> ele =driver.findElements(By.xpath("//html/body/table/tbody/tr/td[1]"));
		  System.out.println("total row element are"+ele.size()); 
		  List<WebElement> ele1= driver.findElements(By.xpath("//html/body/table/thead/tr/th"));
		  System.out.println("total column are"+ele1.size());
		 */

//===========================================================================

		//dynamic
	/*	
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
        List<WebElement> ele= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		System.out.println("total row are"+ele.size());
		List<WebElement> ele1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("total column are"+ele1.size());
	*/	
		
//========================================================================
		
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> ele = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		double max = 0, price=0;
		for(WebElement e:ele) {
			System.out.println("total price is  "+e.getText());
			max=Double.parseDouble(e.getText());
		 if(max < price ) {
			  max=price;
			  }
		}
		System.out.println("max price is  "+max);
		
		
//========================================================================
		
	}

}
