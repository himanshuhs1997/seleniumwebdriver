package WebDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTotalHyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eroomrent.in");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
        int working=0;
		int notworking=0;
		for (WebElement e:ele) {
			String s= e.getAttribute("href");           // for printing path
			int Slashposition = s.lastIndexOf("/");      // for check link page name
			System.out.println(Slashposition);
			String s1 = s.substring(Slashposition+1);
			System.out.println(s1);
			if (s1.equals("") || s1.equals("#"))
			{
				  notworking++;
			}else {
				working++;
			}
			 System.out.println("path is "+s);
			
			 System.out.println("total hyper link"+ele.size());	
		     System.out.println("total hyper link working"+working);	
		     System.out.println("total hyper link notworking"+notworking);
	}
		
		
//=======================================================================
		
	/*	
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://eroomrent.in/index.php");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		Iterator it = ele.iterator();
		ArrayList arrlist = new ArrayList();
		int a=0,b=0;
		while(it.hasNext())  {
			WebElement e =(WebElement)it.next();
			String u =e.getAttribute("href");
			if(u.equals("") || u.equals("#"))  {
				a++;
			}else {
				b++;
			}
			arrlist.add(u);
		System.out.println(u);
			}
		for(Object o: arrlist)  {
			driver.navigate().to(o.toString());
			driver.navigate().back();
			driver.navigate().refresh();
	       }
		System.out.println("Total Hyperlinks are "+ele.size());
		System.out.println("Total non Working Hyperlinks are "+a);
		System.out.println("Total working Hyperlinks are "+b);
		*/
		
		
	}

}
