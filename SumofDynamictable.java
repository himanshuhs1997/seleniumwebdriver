package WebDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumofDynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		float sum= 0;
		float sum1=0;
	    List<WebElement> ele = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[3]"));
	    ArrayList<Double> obj= new ArrayList<Double>();       //for accending
	    for(WebElement e:ele) {
	    	obj.add(Double.parseDouble(e.getText()));         //for accending
	    System.out.println("total prev. price "+e.getText());
	     sum= sum+Float.parseFloat(e.getText());
	     }
	    Collections.sort(obj);                                  //for accending
	    System.out.println("Accending data are");                 //for accending
	    for(Double data: obj) {                                //for accending
	    	System.out.println(data+"");                         //for accending
	    }
	    System.out.println("total sum of prev. price"+sum);
	    
	    
	    List<WebElement> ele1 = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
	    ArrayList<Double> obj1= new ArrayList<Double>();
	    for(WebElement e1:ele1) {
	    	obj1.add(Double.parseDouble(e1.getText()));
	    System.out.println("total current price "+e1.getText());
	    sum1 = sum1+Float.parseFloat(e1.getText());
	     }
	    Collections.sort(obj1);
	    System.out.println("Accending 1 data are");
	    for(Double data1:obj1) {
	    System.out.println(data1);	
	    }
	    System.out.println("total sum of current price"+sum1);
	    System.out.println(sum+sum1);
	     
	}

}
