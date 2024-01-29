package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://eroomrent.in");
		String s = driver.getTitle();
		if (s!="") {
			System.out.println(" tittle is"+s);
		} else {
			System.out.println("not a tittle");
			
		}
		*/
		
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://eroomrent.in");
		String s = driver.getTitle();
		if(s!="") {
			System.out.println("tittle is "+s);
			if(s.length()<100) {
				System.out.println("tittle is valid");
			}else {
				System.out.println("tittle is not valid");
			}
		}else {
			System.out.println("tittle is not set");
		}
		
//============================================================================		
		
	/*	
	   System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://shivaconceptsolution.com");
		String s1= driver.getTitle();
		if (s1!="") {
			System.out.println("tittle is"+s1);
		}else {
			System.out.println("tittle is not set");
		}
	*/	

//=======================================================================
	
/*		
		System.setProperty("Webdriver.chrome.driver","c://ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String s= driver.getTitle();
		if (s!="") {
			System.out.println("tittle is "+s);
		}else {
			System.out.println("tittle is not set");
		}
*/		
		
//===============================================================================		
		
	/*
		System.setProperty("Webdriver.chrome.driver","c://ChromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String s= driver.getTitle();
		if (s!="") {
			System.out.println("tittle is "+s);
			if (s.length()<70) {
				System.out.println("tittle is valid");
			}else {
				System.out.println("tittle is invalid");
			}
		}else {
			System.out.println("tittle is not set");
		}	
	*/	
		
		
		
		
		
		
	}

}
