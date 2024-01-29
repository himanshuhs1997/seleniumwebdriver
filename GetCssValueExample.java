package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shivaconceptsolution.com/backupmain/test.html");
		WebElement textele = driver.findElement(By.xpath("//html/body/input[8]"));
		String color = textele.getCssValue("color");
		String width = textele.getCssValue("width");
		String height = textele.getCssValue("height");
		System.out.println("color is "+color);
		System.out.println("width is "+width);
		System.out.println("height is "+height);
		
		
//===============================================================================		
		
		// amazon
	/*
		System.setProperty("Webdriver.chrome.driver","c://chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
	*/	
		
		
		
		
		
	}

}
